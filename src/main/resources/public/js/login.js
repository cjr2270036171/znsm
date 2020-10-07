function login(){
    var un=document.getElementById("username").value;
    var pw=document.getElementById("password").value;
    // var pw=$("#password").val();
    $.ajax({
        url:"/login",
        type:"get",
        data:{
            username:un,
            password:pw
        },
        dataType:"json",
        success:function (date){

            if(date.code == 1){
                alert(date.msg);
                window.location.href = "./index1.html"
            }else{
                alert(date.msg);
            }
        }
    })

}

function zc() {
    var tjyhck1 = document.getElementsByClassName("tjyhck1")[0];
    var tjyhck = document.getElementsByClassName("tjyhck")[0];
    tjyhck.style.display = "inline ";
    tjyhck1.style.display = "inline ";
}

var close = document.getElementById("close")
close.onclick = function () {
    document.getElementsByClassName("tjyhck1")[0].style.display="none";
    document.getElementsByClassName("tjyhck")[0].style.display="none";
}


function add_tj(){
    var add_username = $("#add_username").val();
    var add_password = $("#add_password").val();
    var add_password1 = $("#add_password1").val();
    var add_username1 = add_username.trim();   //去除空格
    if (add_password === add_password1) {  //判断两次密码是否一致
        if(add_username1.length >= 6){   //判断用户名小于6位
            $('#tishi').css('display','none');
             $.ajax({
                url:"/addlogin",
                type:"get",
                data:{
                    username:add_username,
                    password:add_password,
                },
                dataType:"json",
                success:function (date){
                    if(date.code === 1){
                        alert(date.msg);
                    }else{
                        alert(date.msg);
                    }
                }
            })
            }else {
                $('#tishi').css('display','');
                $('#tishi').html("用户名小于6位");
            }
    }else {
        $('#tishi').css('display','');
        $('#tishi').html("密码不一致");
    }
}
