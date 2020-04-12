package com.atguigu.test06.bean;

public class Rectangle {
    private double Ligth;
    private double width;

    public double getLigth() {
        return Ligth;
    }

    public void setLigth(double ligth) {
        Ligth = ligth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return Ligth*width;
    }
    public double getPerimeter(){
        return (Ligth+width)*2;
    }
    public String getInfo(){
        return"长："+Ligth+" 宽："+width+" 面积："+getArea()+" 周长："+getPerimeter();
    }
}
