package com.znsm.znsm.entity;

//通讯数据
public class Tsxj {
    private  Integer id;
    private String x;
    private String y;
    private String Ang;
    private String Attr;
    private String Atv;

    public Tsxj() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getAng() {
        return Ang;
    }

    public void setAng(String ang) {
        Ang = ang;
    }

    public String getAttr() {
        return Attr;
    }

    public void setAttr(String attr) {
        Attr = attr;
    }

    public String getAtv() {
        return Atv;
    }

    public void setAtv(String atv) {
        Atv = atv;
    }

    @Override
    public String toString() {
        return "tsxj{" +
                "id=" + id +
                ", x='" + x + '\'' +
                ", y='" + y + '\'' +
                ", Ang='" + Ang + '\'' +
                ", Attr='" + Attr + '\'' +
                ", Atv='" + Atv + '\'' +
                '}';
    }
}
