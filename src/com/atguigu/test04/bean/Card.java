package com.atguigu.test04.bean;

public class Card {
    private String huanse;
    private String dianshu;

    public Card(String huanse, String dianshu) {
        this.huanse = huanse;
        this.dianshu = dianshu;
    }

    public String getHuanse() {
        return huanse;
    }

    public void setHuanse(String huanse) {
        this.huanse = huanse;
    }

    public String getDianshu() {
        return dianshu;
    }

    public void setDianshu(String dianshu) {
        this.dianshu = dianshu;
    }

    public void showCard(){
        System.out.println(huanse+dianshu);
    }
}
