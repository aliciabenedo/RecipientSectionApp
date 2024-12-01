/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodrescue.app;

/**
 *
 * @author NagbontianAliciaBene
 */
public class FoodDonation {
    private String foodType;
    private int quantity;
    private String expirationDate;

    public FoodDonation(String foodType, int quantity, String expirationDate) {
        this.foodType = foodType;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    public String getFoodType() {
        return foodType;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}
