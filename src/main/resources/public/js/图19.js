//箭头1
var jt1 =  document.getElementById("jt1");
//箭头2
var jt2 =  document.getElementById("jt2");
//数字
var sz = document.getElementById("sz");
var x = 77;
jt1.onclick = function () {
    if (x > 0 ){
        x = x - 1;
        sz.innerHTML = x;
    }

};
jt2.onclick = function () {
    if (x < 99 ){
        x = x + 1
        sz.innerHTML = x;
    }
};
/**
 * 当选到0时 相机视野范围为标定可以触法
 * @type {HTMLElement}
 */
var xjfw = document.getElementById("xjfw");
xjfw.onclick = function () {
    if (sz.innerHTML == 0){
        window.location.href = "图二十.html";
    }

}

