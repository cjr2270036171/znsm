var qc = document.getElementById("qc");
/*var jd1min = document.getElementById("jd1min");
var jd1max = document.getElementById("jd1max");
var jd2min = document.getElementById("jd2min");
var jd2max = document.getElementById("jd2max");
var yuan = document.getElementById("yuan");*/
/**
 * 清除事件
 */
qc.onclick = function(){
    document.getElementById("xmin").value = "0.000";
    document.getElementById("xmax").value = "0.000";
    document.getElementById("ymin").value = "0.000";
    document.getElementById("ymax").value = "0.000";
};

/**
 * 范围监控有效园的变色
 */
function abc(){
    var jd1min = document.getElementById("jd1min").value;
    var jd1max = document.getElementById("jd1max").value;
    var jd2min = document.getElementById("jd2min").value;
    var jd2max = document.getElementById("jd2max").value;
    var a = jd1min.trim();
    var b = jd1max.trim();
    var c = jd2min.trim();
    var d = jd2max.trim();
        if (jd1min < -360.000){
            yuan.style.backgroundColor = "#C0C0C0";
        }else if(jd1max > 360.000){
            yuan.style.backgroundColor = "#C0C0C0";
        }else if (jd2min < -360.000){
            yuan.style.backgroundColor = "#C0C0C0";
        }else if (jd2max > 360.000){
            yuan.style.backgroundColor = "#C0C0C0";
        }else  if (a === "") {
            yuan.style.backgroundColor = "#C0C0C0";
        } else if (b === "") {
            yuan.style.backgroundColor = "#C0C0C0";
        } else if (c === "") {
            yuan.style.backgroundColor = "#C0C0C0";
        } else if (d === "") {
            yuan.style.backgroundColor = "#C0C0C0";
        } else {
            yuan.style.backgroundColor = "#01FF01";
        }
}
setInterval(abc,1);


var jl = document.getElementById("jl");
jl.onclick = function () {
    document.getElementById("xmin").value = "200.000";
    document.getElementById("xmax").value = "200.000";
    document.getElementById("ymin").value = "200.000";
    document.getElementById("ymax").value = "200.000";
}


//点击完成
var wc = document.getElementById("wc");
wc.onclick = function () {
    a = yuan.style.backgroundColor;
    b = "rgb(1, 255, 1)";
    if (a === b){
        $.ajax({
            url:"/CfovController",
            type:'get',
            dataType:'json',
            data:{
                xdmin:$('#xmin').val(),
                xdmax:$('#xmax').val(),
                ydmin:$('#ymin').val(),
                ydmax:$('#ymax').val(),
                angle1min:$('#jd1min').val(),
                angle1max:$('#jd1max').val(),
                angle2min:$('#jd2min').val(),
                angle2max:$('#jd2max').val()
            },
            success:function (data) {
                if (data.code == 0) {
                    alert(data.msg);
                } else {
                    window.location.href="视觉设置界面2.html";
                }
            }
        });
    }else {
        alert("请确认范围监控有效");
    }
}