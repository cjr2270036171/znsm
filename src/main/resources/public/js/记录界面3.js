var xyb = document.getElementById("xyb");
xyb.onclick = function () {
    $.ajax({
        url:"/addvr2",
        type:'get',
        dataType:'json',
        data:{
            x:$('#x').html(),
            y:$('#y').html(),
            a:$('#a').html(),
            x1:$('#x1').html(),
            y1:$('#y1').html(),
            z:$('#z').html(),
            a1:$('#a1').html(),
            b:$('#b').html(),
            c:$('#c').html(),
        },
        success:function (data) {
            if (data.code == 0) {
                alert(data.msg);
            } else {
                window.location.href='记录界面4.html'
            }
        }
    });
};