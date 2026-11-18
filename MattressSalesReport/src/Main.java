/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] sales = new int[3][3];
        
        String[] productNames = {
            "Cozy Nights Monarch mattress", 
            "Restonic Barbados mattress", 
            "Sealy Phuket mattress"
        };

        // Prompt user for sales data matching the sample screenshot
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + productNames[i] + ": ");
                sales[i][j] = scanner.nextInt();
            }
        }
        System.out.println();

        // Instantiate Product and PrintProduct classes
        Product product = new Product(sales);
        PrintProduct printer = new PrintProduct();
        printer.printReport(product);
        
        scanner.close();
    }
}