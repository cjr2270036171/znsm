
/**
 * 与后端交互
 * @type {HTMLElement}
 */
al = document.getElementById("al")
al.onclick = function () {
    var ipdz = document.getElementById("ipdz").value;
    var dkh = document.getElementById("dkh").value;
    var cmd = document.getElementById("cmd").value;
    console.log(ipdz)
    console.log(dkh)
    console.log(cmd)
    $.ajax({
        url:"/index",
        type:'get',
        dataType:'json',
        data:{
            ipaddress:ipdz,
            dkh:dkh,
            cmd:cmd
        },
        success:function (data) {
            if (data.code == 0) {
                alert(data.msg);
            } else {
                window.location.href = "./TCP已建立连接时的状态.html";
            }
        }
    })
}

function xdl() {
    window.location.href="信号管理.html";
}

