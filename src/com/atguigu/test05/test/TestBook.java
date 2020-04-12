package com.atguigu.test05.test;

import com.atguigu.test05.bean.Book;

public class TestBook {
    public static void main(String[] args) {
       Book[] a = new Book[5];
       a[0]= new Book(1,"《Java从入门到放弃》","张三",50,5000,10000,"img/path");
       a[1]= new Book(2,"《Java从入门到秃头》","张三",52,4000,7550,"");
       a[2]= new Book(3,"《Java从入门到精通》","张三",67,4500,8000,"");
       a[3]= new Book(4,"《Java从入门到吃药》","张三",48,5500,9000,"");
       a[4]= new Book(5,"《Java从入门到升仙》","张三",80,6000,11000,"");
       for(int i=1;i<a.length;i++){
           for(int j=0;j<a.length-i;j++){
               if(a[j].getSales()>a[j+1].getSales()){
                   Book temp=a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
               }
           }
       }
       for(int i=0;i<a.length;i++){
           System.out.println(a[i].getInfo());
       }
}
}
