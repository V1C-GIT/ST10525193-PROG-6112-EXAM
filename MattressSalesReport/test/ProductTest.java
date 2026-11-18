/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        // Sample data matching the test requirement
        int[][] sampleData = {
            {25, 18, 20}, // Total: 63
            {15, 10, 12}, // Total: 37
            {18, 15, 20}  // Total: 53
        }; // Overall Total = 153
        
        Product product = new Product(sampleData);
        assertEquals(153, product.GetTotalProductsSold());
    }

    @Test
    public void GetAveragesSales_WithValidData_ReturnsCorrectValue() {
        int[][] sampleData = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        }; // Total = 153, divided by 3 products = 51.0 (or check individual expectations)
        
        Product product = new Product(sampleData);
        assertEquals(51.0, product.GetAverageProductSold(), 0.001);
    }
}