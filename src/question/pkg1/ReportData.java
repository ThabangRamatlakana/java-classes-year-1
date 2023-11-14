/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg1;

/**
 *
 * @author Thabang
 */
public class ReportData 
{
    private String code;
    private String name;
    private int category;
    private int warranty;
    private int price;
    private int stock;
    private String supplier;
    
//    Products products = new Products();
    Product[] products = new Product[20];

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
    
    public void display(Product[] products, int count)
    {
        for (int i = 0; i < count; i++) 
        {
            
        }
    }
    // calculate the total
    public double calcTotal(Product[] products, int count)
    {
        int total = 0;
        for (int i = 0; i < count; i++) 
        {
            total = products[i].getPrice();
        }
        return total;
    }
    
    public double calcAvg(Product[] products, int count)
    {
        double avg = calcTotal(Product[]) / count;
        return avg;
    }
    
    
    
    
}
