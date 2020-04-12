package com.atguigu.test05.bean;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private double price;
    private Integer sales;
    private Integer stock;
    private String imgPath="static/img/defult.jpg";

    public Book() {
    }

    public Book(Integer id, String title, String author, double price, Integer sales, Integer stock, String imgPath) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.sales = sales;
        this.stock = stock;
        this.imgPath = imgPath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
    public String getInfo(){
        return id + "\t" + title + "\t" + author + "\t" + price + "\t" + sales + "\t" + stock + "\t" + imgPath;
    }

}
