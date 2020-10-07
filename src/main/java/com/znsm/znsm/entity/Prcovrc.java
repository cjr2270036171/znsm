package com.znsm.znsm.entity;

//视觉记录相机像素分辨率标定
public class Prcovrc {
    private Integer id;
    private String x;
    private String y;
    private String a;
    private String j1;
    private String j2;
    private String j3;
    private String j4;
    private String j5;
    private String j6;
    private String j7;
    private String j8;

    public Prcovrc() {
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

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getJ1() {
        return j1;
    }

    public void setJ1(String j1) {
        this.j1 = j1;
    }

    public String getJ2() {
        return j2;
    }

    public void setJ2(String j2) {
        this.j2 = j2;
    }

    public String getJ3() {
        return j3;
    }

    public void setJ3(String j3) {
        this.j3 = j3;
    }

    public String getJ4() {
        return j4;
    }

    public void setJ4(String j4) {
        this.j4 = j4;
    }

    public String getJ5() {
        return j5;
    }

    public void setJ5(String j5) {
        this.j5 = j5;
    }

    public String getJ6() {
        return j6;
    }

    public void setJ6(String j6) {
        this.j6 = j6;
    }

    public String getJ7() {
        return j7;
    }

    public void setJ7(String j7) {
        this.j7 = j7;
    }

    public String getJ8() {
        return j8;
    }

    public void setJ8(String j8) {
        this.j8 = j8;
    }

    @Override
    public String toString() {
        return "Prcovrc{" +
                "id=" + id +
                ", x='" + x + '\'' +
                ", y='" + y + '\'' +
                ", a='" + a + '\'' +
                ", j1='" + j1 + '\'' +
                ", j2='" + j2 + '\'' +
                ", j3='" + j3 + '\'' +
                ", j4='" + j4 + '\'' +
                ", j5='" + j5 + '\'' +
                ", j6='" + j6 + '\'' +
                ", j7='" + j7 + '\'' +
                ", j8='" + j8 + '\'' +
                '}';
    }
}
