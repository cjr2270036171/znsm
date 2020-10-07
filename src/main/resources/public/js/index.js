/**
 * 清除记录
 */
qc.onclick = function() {
    document.getElementById("x").innerHTML = "X:0.000";
    document.getElementById("y").innerHTML = "Y:0.000";
    document.getElementById("z").innerHTML = "Z:0.000";
    document.getElementById("a").innerHTML = "A:0.000";
    document.getElementById("b").innerHTML = "B:0.000";
    document.getElementById("c").innerHTML = "C:0.000";
    document.getElementById("x1").innerHTML = "0.000";
    document.getElementById("y1").innerHTML = "0.000";
};

/**
 * 选择视觉
 * @type {HTMLElement}
 */
var yq1 =  document.getElementById("yq1");
var yq2 =  document.getElementById("yq2");
var yq3 =  document.getElementById("yq3");
//隐藏箭头元素
var yc = document.getElementById("yc");
yc.style.display="none";
yq1.onclick = function() {
    yq1.style.backgroundColor = "#00FF01";
    yq2.style.backgroundColor = "#FFFFFF";
    yq3.style.backgroundColor = "#FFFFFF";
    //隐藏箭头元素
    yc.style.display="none";
};
yq2.onclick = function() {
    yq1.style.backgroundColor = "#FFFFFF";
    yq2.style.backgroundColor = "#00FF01";
    yq3.style.backgroundColor = "#FFFFFF";
    //隐藏箭头元素
    yc.style.display="none";
};
/**
 *
 * 移动视觉
 */
yq3.onclick = function() {
    yq1.style.backgroundColor = "#FFFFFF";
    yq2.style.backgroundColor = "#FFFFFF";
    yq3.style.backgroundColor = "#00FF01";

    //显示箭头等元素
    yc.style.display="inline";
    //箭头1
    var jt1 =  document.getElementById("jt1");
    //箭头2
    var jt2 =  document.getElementById("jt2");
    //数字
    var sz = document.getElementById("sz");
    var x = 1;
    jt1.onclick = function () {
        if (x > 1 ){
            x = x-1;
            sz.innerHTML = x;
        }
    };
    jt2.onclick = function () {
        if (x < 10 ){
            x = x + 1
            sz.innerHTML = x;
        }
    }
};
/**
 * 选择完移动视觉后点击的按钮
 */
var an = document.getElementById("an");
an.onclick = function () {
    window.location.href = "./图19.html";
}

