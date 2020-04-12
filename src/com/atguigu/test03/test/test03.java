package com.atguigu.test03.test;

import com.atguigu.test03.bean.MyDate;

public class test03 {
    public static void main(String[] args) {
        MyDate m = new MyDate();
        m.setYear(2000);
        m.setMonth(12);
        m.setDay(31);
        m.showDate();
        boolean flag = m.isLeapYear();
        System.out.println(m.getYear()+"年"+(flag ?"是闰年":"不是闰年"));
    }
}
