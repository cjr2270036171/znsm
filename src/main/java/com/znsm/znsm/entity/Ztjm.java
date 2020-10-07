package com.znsm.znsm.entity;

public class Ztjm {
    private Integer id;
    private String ipaddress;//IP地址
    private String dkh;//端口号
    private String cmd;//相机命令

    public Ztjm() {
    }

    public Ztjm(Integer id, String ipaddress, String dkh, String cmd) {
        this.id = id;
        this.ipaddress = ipaddress;
        this.dkh = dkh;
        this.cmd = cmd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public String getDkh() {
        return dkh;
    }

    public void setDkh(String dkh) {
        this.dkh = dkh;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    @Override
    public String toString() {
        return "Ztjm{" +
                "id=" + id +
                ", ipaddress='" + ipaddress + '\'' +
                ", dkh='" + dkh + '\'' +
                ", cmd='" + cmd + '\'' +
                '}';
    }
}
