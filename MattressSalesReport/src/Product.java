/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Product implements IProducts {
    // Single-dimensional array for product names
    private String[] productNames = {
        "Cozy Nights Monarch", 
        "Restonic Barbados", 
        "Sealy Phuket"
    };

    // Two-dimensional array for sales: [products][months]
    private int[][] salesData;

    // Constructor to initialize sales data
    public Product(int[][] salesData) {
        this.salesData = salesData;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                total += salesData[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int totalEntries = salesData.length * salesData[0].length; // 3 products * 3 months = 9 entries
        return (double) total / totalEntries; // 153 / 9 = 17.0
    }

    @Override
    public String GetMostPopularProduct() {
        int maxSales = -1;
        int maxIndex = 0;

        for (int i = 0; i < salesData.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                productTotal += salesData[i][j];
            }
            if (productTotal > maxSales) {
                maxSales = productTotal;
                maxIndex = i;
            }
        }
        return productNames[maxIndex] + " (" + maxSales + ")";
    }
}