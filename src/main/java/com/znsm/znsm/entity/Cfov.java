package com.znsm.znsm.entity;

//相机视野范围
public class Cfov {
    private Integer id;
    private String xdmin;    //X方向最小值
    private String xdmax;   //X方向最大值
    private String ydmin;   //Y方向最小值
    private String ydmax;   //Y方向最大值
    private String angle1min;   //角度1最小值
    private String angle1max;   //角度1最大值
    private String angle2min;   //角度2最小值
    private String angle2max;   //角度2大值

    public Cfov() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getXdmin() {
        return xdmin;
    }

    public void setXdmin(String xdmin) {
        this.xdmin = xdmin;
    }

    public String getXdmax() {
        return xdmax;
    }

    public void setXdmax(String xdmax) {
        this.xdmax = xdmax;
    }

    public String getYdmin() {
        return ydmin;
    }

    public void setYdmin(String ydmin) {
        this.ydmin = ydmin;
    }

    public String getYdmax() {
        return ydmax;
    }

    public void setYdmax(String ydmax) {
        this.ydmax = ydmax;
    }

    public String getAngle1min() {
        return angle1min;
    }

    public void setAngle1min(String angle1min) {
        this.angle1min = angle1min;
    }

    public String getAngle1max() {
        return angle1max;
    }

    public void setAngle1max(String angle1max) {
        this.angle1max = angle1max;
    }

    public String getAngle2min() {
        return angle2min;
    }

    public void setAngle2min(String angle2min) {
        this.angle2min = angle2min;
    }

    public String getAngle2max() {
        return angle2max;
    }

    public void setAngle2max(String angle2max) {
        this.angle2max = angle2max;
    }

    @Override
    public String toString() {
        return "Cfov{" +
                "id=" + id +
                ", xdmin='" + xdmin + '\'' +
                ", xdmax='" + xdmax + '\'' +
                ", ydmin='" + ydmin + '\'' +
                ", ydmax='" + ydmax + '\'' +
                ", angle1min='" + angle1min + '\'' +
                ", angle1max='" + angle1max + '\'' +
                ", angle2min='" + angle2min + '\'' +
                ", angle2max='" + angle2max + '\'' +
                '}';
    }
}
