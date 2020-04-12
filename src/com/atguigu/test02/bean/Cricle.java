package com.atguigu.test02.bean;

public class Cricle {
    private double radius;

    public Cricle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void showArea(){
        System.out.println("圆的面积："+Math.PI*radius*radius);
    }
    public void  showPerimeter(){
        System.out.println("圆的周长："+Math.PI*2*radius);
    }
}
