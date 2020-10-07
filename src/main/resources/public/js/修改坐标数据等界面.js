//上一步
function syb(){
    window.location.href='记录界面4.html'
}

//点击完成、手动设置
function wc() {

    $.ajax({
        url: "/addindex",
        type: 'get',
        dataType: 'json',
        data: {
            x:$('#x').html(),
            y:$('#y').html(),
            z:$('#z').html(),
            a:$('#a').html(),
            b:$('#b').html(),
            c:$('#c').html(),
            x1:$('#x1').html(),
            y1:$('#y1').html()
        },
        success: function (data) {
            console.log(data);
            if (data.code){
                window.location.href='index1.html';
            }else {
                alert("设置失败，请重新设置")
            }
        }
    })
}
