package com.example.entity;

public class Product {
    private String productName;
    private int productPrice;
    private String productDescribe;
    private int productId;

    public Product(String productName, int productPrice, String productDescribe, int productId) {
        super();
        this.productName = productName;
        this.productPrice = productId;
        this.productDescribe = productDescribe;
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescribe() {
        return productDescribe;
    }

    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Product: [Name: " + productName + ", Price: " + productPrice + ", Describe: " + productDescribe + ", Id: " + productId + "]";
    }
}
