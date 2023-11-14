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
public class QUESTION1 
{
     private static String menu = " Please select one of the following menu items: \n (1) Capture a new product" + 
             "\n (2) Search for a product \n (3) Update a product \n (4) Delete a product \n (5) Print report \n (6) Exit application";
    private static String header = " BRIGHT FUTURE TECHNOLOGIES APPLICATION \n***************************************" +
            "\n Enter (1) to launch menu or any other key to quit";
    private static int option = -1;
    private static int CONTINUE = 1;
    private static final int CAPTURE = 1;
    private static final int SEARCH = 2;
    private static final int UPDATE = 3;
    private static final int DELETE = 4;
    private static final int PRINT = 5;
    private static final int EXIT = 6;
    private static Scanner sc = new Scanner(System.in);
    
    
     public static void main(String[] args) 
    {
         int count = 0;
         int answerContinue = -1; 
         Products pd = new Products();
         
         System.out.println(header);
         option = sc.nextInt();
         
         while (option == CONTINUE && count < 20) 
        {
            System.out.println(menu);
            option = sc.nextInt();

            switch (option) 
            {
                case CAPTURE:
                    pd.captureNewProduct(count);
                    System.out.println("Enter (1) to launch menu or any other key to exit");
                    option= sc.nextInt();
                    count++;
                   break;
                case SEARCH:
                    pd.searchProduct(count);
                    System.out.println("Enter (1) to launch menu or any other key to exit");
                    option= sc.nextInt();
                    count++;
                    break;
                case UPDATE:
                    pd.updateProduct(count);
                    System.out.println("Enter (1) to launch menu or any other key to exit");
                    option= sc.nextInt();
                    count++;
                    break;
                case DELETE:
                    pd.deleteProduct();
                    System.out.println("Enter (1) to launch menu or any other key to exit");
                    option= sc.nextInt();
                    count++;
                     break;
                case PRINT:
                    ReportData rp = new ReportData();
                    rp.display();
                    break;
                case EXIT:
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }
         System.exit(0);
    }
    
}
