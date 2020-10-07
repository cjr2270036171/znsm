/**
 * 与后端交互确认连接按钮以及右侧圆形的颜色
 * @type {HTMLElement}
 */
al = document.getElementById("al");
// idzz 连接旁边的圆
var idzz = document.getElementById("idzz");
al.onclick = function () {
    a = al.style.backgroundColor;
    b = "rgb(0, 255, 0)";
    c = "rgb(158, 158, 158)";
    if (a === b){
        al.style.backgroundColor = "#9E9E9E";
        idzz.style.backgroundColor = "#C0C0C0";
    }else if (a === c) {
        var ipdz = document.getElementById("ipdz").value;
        var dkh = document.getElementById("dkh").value;
        var cmd = document.getElementById("cmd").value;
        console.log(ipdz);
        console.log(dkh);
        console.log(cmd);
        $.ajax({
            url: "/index",
            type: 'get',
            dataType: 'json',
            data: {
                ipaddress: ipdz,
                dkh: dkh,
                cmd: cmd
            },
            success: function (data) {
                if (data.code == 0) {
                    alert(data.msg);
                } else {
                    al.style.backgroundColor = "#00FF00";
                    idzz.style.backgroundColor = "#00FF00";
                }
            }
        })
    }
};

/**
 * 系统激活
 * 激活指定的视觉系统，此时，系统激活按钮旁的圆形指示灯变绿，视觉跟踪系统进入自动运 行状
 * 态。如果系统有参数设置错误或尚未设置完毕，系统激活按钮是不可操作的
 */
var xtjh = document.getElementById("xtjh");
//系统激活旁边的圆
var idzz1 = document.getElementById("idzz1");
//右上角三个圆
var tuoyuan1 = document.getElementById("tuoyuan1");
var tuoyuan2 = document.getElementById("tuoyuan2");
var tuoyuan3 = document.getElementById("tuoyuan3");
var x = 0;
xtjh.onclick = function () {
    x = x+1;
    if (x % 2 == 1){
        xtjh.style.backgroundColor = "#00FF00";
        idzz1.style.backgroundColor = "#00FF00";
        tuoyuan2.style.backgroundColor = "#00FF00";
        tuoyuan3.style.backgroundColor = "#00FF00";
    }else{
        xtjh.style.backgroundColor = "#9E9E9E";
        idzz1.style.backgroundColor = "#C0C0C0";
        tuoyuan2.style.backgroundColor = "#FFFFFF";
        tuoyuan3.style.backgroundColor = "#FFFFFF";
    }
};

/**
 * 忽略角度按钮
 */
var hljd = document.getElementById("hljd");
hljd.onclick = function () {
    alert("视觉系统所有拍到的\n" +
        "物体都认为角度为零。当“忽略角度”功能激活，“角度取反”和“对称”功能将不可使用。")
};

/**
 * 角度取反
 * @type {HTMLElement}
 */
var jdqf = document.getElementById("jdqf");
jdqf.onclick = function () {
    alert("用于将视觉系统传送过来的角度值取反。由于示教的原因，可能会造成机\n" +
        "器人抓取的角度方向与实际视觉系统传送过来的角度值刚好相反，只要在此处设置取反即 可。")
};

/**
 * 对称
 * @type {HTMLElement}
 */
var dc = document.getElementById("dc");
dc.onclick = function () {
    alert("用于将视觉系统传送过来的角度进行内部处理。系统会自动将对称的物体的角 度值限制在 +90 度 到 -90 度 之间。")
};
/**
 * 通讯格式1的单击事件
 * @type {HTMLElement}
 */
var tsgs1 = document.getElementById("tsgs1");
tsgs1.onclick = function () {
    alert("用于选择用户所期望的 TCPIP 数据交互的格式")
};

/**
 * 通讯格式2的单击事件
 * @type {HTMLElement}
 */
var  tsgs2 = document.getElementById("tsgs2");
tsgs2.onclick = function () {
    alert("在原始视觉数据乘以 1000 后转化为整形数据发送给机 器人系统")
}

/**
 *通讯格式3的单击事件
 * @type {HTMLElement}
 */
var tsgs3 = document.getElementById("tsgs3")
tsgs3.onclick = function () {
    alert("在原始视觉数据乘以 1000 后转化为整形数据发送给机 器人系统，通讯格式三只支持单个视觉对象数据的发送")
}

/**
 * 通讯格式4的单击事件
 * @type {HTMLElement}
 */
var tsgs4 = document.getElementById("tsgs4");
tsgs4.onclick = function () {
    alert("目前系统暂不支持")
};

/**
 * 通讯数据
 */
var txsj = document.getElementById("txsj")
txsj.onclick = function () {
    if (xtjh.style.backgroundColor === "rgb(158, 158, 158)"){
        alert("请点击连接取消后设置通讯数据")
    } else if (xtjh.style.backgroundColor === "rgb(0, 255, 0)"){
       window.location.href = "./TCP通讯测试界面2.html"
    }else if (xtjh.style.backgroundColor === ""){
        alert("请点击连接取消后设置通讯数据")
    }
}

/**
 * 信号管理
 */
var txsj1 = document.getElementById("txsj1")
txsj1.onclick = function () {
    alert("请点击连接取消后设置通讯数据")
}
