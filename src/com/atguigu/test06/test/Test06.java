package com.atguigu.test06.test;

import com.atguigu.test06.bean.Rectangle;

public class Test06 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLigth(4);
        r.setWidth(2);
        System.out.println("长"+r.getLigth());
        System.out.println("宽"+r.getWidth());
        System.out.println("面积"+r.getArea());
        System.out.println("周长"+r.getPerimeter());
        r.setLigth(r.getLigth()*2);
        r.setWidth(r.getWidth()*2);
        r.getInfo();
    }
}
