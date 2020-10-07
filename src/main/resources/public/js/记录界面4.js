var xyb = document.getElementById("xyb");
xyb.onclick = function () {
    $.ajax({
        url:"/addvr3",
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
                window.location.href="视觉坐标系标定结果显示界面.html"
            }
        }
    });
};