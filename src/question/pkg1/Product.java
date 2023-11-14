/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg1;

import java.util.Scanner;

/**
 *
 * @author Thabang
 */
public class Product 
{
    private String code;
    private String name;
    private int category;
    private int userChoice = 0;
    private int warranty;
    private int price;
    private int stock;
    private String supplier;
    private Scanner sc = new Scanner(System.in);

    public Product() 
    {
        
    }

    public Product(String code, String name, int category, int warranty, int price, int stock, String supplier) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.warranty = warranty;
        this.price = price;
        this.stock = stock;
        this.supplier = supplier;
    }
    
    
    
//    Product products = new Product(code,name,category,warranty, price,stock,supplier);

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getUserChoice() {
        return userChoice;
    }

    public void setUserChoice(int userChoice) {
        this.userChoice = userChoice;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    
}
