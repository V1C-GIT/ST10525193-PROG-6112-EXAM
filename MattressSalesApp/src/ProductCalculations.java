/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class ProductCalculations implements IProductCalculations {
    private double price;

    // Constructor to initialize the product price
    public ProductCalculations(double price) {
        this.price = price;
    }

    @Override
    public double GetVat() {
        return price * 0.15; // 15% VAT
    }

    @Override
    public double GetCommission() {
        return price * 0.05; // 5% Commission
    }

    @Override
    public double GetTotal() {
        return price + GetVat() + GetCommission();
    }
}
