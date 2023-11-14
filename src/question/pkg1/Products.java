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

public class Products 
{
    
    Product[] products = new Product[20];
    private int index= -1;
    private String code;
    private String name;
    private int category;
    private int userChoice = 0;
    private int warranty;
    private int price;
    private int stock;
    private String supplier;
    private Scanner sc = new Scanner(System.in); //(Joyce, 2019)
    private String category1 = "Desktop computer";
    private String category2 = "Laptop";
    private String category3 = "Tablet";
    private String category4 = "Printer";
    private String category5 = "Gaming";

    public Products() 
    {
        products = new Product[20];
    }
    
    
    
    public void captureNewProduct(int count)
{
    
    
    System.out.println("CAPTURE A NEW PRODUCT \n ****************** ");
    System.out.println("Enter product code: ");
    code = sc.next();
    System.out.println("Enter the product name: ");
    name = sc.next(); 
    System.out.println("Select the product category: \n Desktop computer - 1 \n Laptop - 2 \n Tablet -3 \n Printer - 4 \n" +
            "Gaming console - 5");
    System.out.println("Product catergory >> ");
    category = sc.nextInt();
    
    if (category == 1 || category == 2 || category == 3 || category == 4 || category == 5) 
    {
        System.out.println("Indicate the product warranty. Enter (1) for 6 months or any other key for 2 years. ");
        warranty= sc.nextInt();
        /// set the values for the warranty
        if (warranty == 1) 
        {
            warranty = 6;
        }
        else
        {
            warranty = 2*12;
        }
        System.out.println("Enter the price for " + name + ">> ");
        price = sc.nextInt();
        System.out.println("Enter the stock level for " + name + ">> ");
        stock = sc.nextInt();
        System.out.println("Enter the supplier for " + name + ">> ");
        supplier = sc.next();
        System.out.println("Product details has been saved successfully!!!");
        
        
    }
    else 
    {
        System.out.println("Incorrect product category. Please try again");
        System.out.println("Select the product category: \n Desktop computer - 1 \n Laptop - 2 \n Tablet -3 \n Printer - 4 \n" +
            "Gaming console - 5");
        System.out.println("Product catergory >> ");
        category = sc.nextInt();
        
        System.out.println("Indicate the product warranty. Enter (1) for 6 months or any other key for 2 years. ");
        warranty= sc.nextInt();
        if (warranty == 1) 
        {
            warranty = 6;
        }
        else
        {
            warranty = 2*12;
        }
        System.out.println("Enter the price for " + name + ">> ");
        price = sc.nextInt();
        System.out.println("Enter the stock level for " + name + ">> ");
        stock = sc.nextInt();
        System.out.println("Enter the supplier for " + name + ">> ");
        supplier = sc.next();
        System.out.println("Product details has been saved successfully!!!");
        
        
    }
      Product product = new Product(code,name,category,warranty, price,stock,supplier);
      products[count] = product;
    // System.out.println("Enter (1) to launch menu or any other key to exit");
     
    
    
    
    
}
    public void searchProduct(int count)
    {
        String code;
//        int index = -1;
        System.out.println("Please enter the product code to search: ");
        code = sc.next();
        for (int i = 0; i < count; i++) 
        {
            if (products[i].getCode().equals(code)) 
            {
                index = i;
                break;
            }
            
        }
         if (index == -1) 
            {
                System.out.println("The product cannot be located. Invalid product.");
                
            }
            else
            {
             System.out.println("*****************************************************");
             System.out.println("PRODUCT SEARCH RESULTS");
             System.out.println("*****************************************************");
             System.out.println("PRODUCT CODE : \t\t  " + products[index].getCode());
             System.out.println("PRODUCT NAME : \t\t  " + products[index].getName());
             System.out.println("PRODUCT WARRANTY : \t\t" + products[index].getWarranty() + " months");
             System.out.println("PRODUCT CATEGORY : \t\t" + products[index].getCategory());
             System.out.println("PRODUCT PRICE : \t  R" + products[index].getPrice());
             System.out.println("PRODUCT STOCK LEVELS : \t" + products[index].getStock());
             System.out.println("PRODUCT SUPPLIER : \t" + products[index].getSupplier());
             System.out.println("*****************************************************");
            }
       
        }
    
    public void deleteProduct()
    {
        
    }
    
    public void updateProduct(int count)
    {
        String warranty;
        String price;
        String stockLevel;
        String yes = "y";
        int index = -1;
        System.out.println("Please enter the product code to update: ");
        code= sc.next();
        for (int i = 0; i < count; i++) 
        {
            if (products[i].getCode().equals(code)) 
            {
                index = i;
                break;
            }
            
        }
        System.out.println("Update the warranty? (y) Yes, (n) No");
        warranty=sc.next();
        if (warranty.equals("y")) 
        {
            System.out.println("Enter the new warranty. 6 months or 24 months");
            int wy = sc.nextInt();
            products[index].setWarranty(wy);
        }
        System.out.println("Update the product price? (y) Yes, (n) No");
        price = sc.next();
        if (price.equals("y"))
        {
            System.out.println("Enter the new price for " + name + " >>");
            int p = sc.nextInt();
        products[index].setPrice(p);
        }
        System.out.println("Update the stock level? (y) Yes, (n) No");
        stockLevel= sc.next();
        if (stockLevel.equals("y")) 
        {
            System.out.println("Enter the new stock level");
            int sl = sc.nextInt();
            products[index].setStock(sl);
        }
        System.out.println("Product details has been updated successfully!!!");
    }
       
        
        
        
        
    

}

