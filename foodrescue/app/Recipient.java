/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodrescue.app;
import java.util.ArrayList;
/**
 *
 * @author NagbontianAliciaBene
 */
public class Recipient {
    private String name;
    private String contactInfo;
    private final ArrayList<FoodDonation> claimedDonations;
    private ArrayList<FoodDonation> requestHistory; 

    public Recipient(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.claimedDonations = new ArrayList<>();
        this.requestHistory = new ArrayList<>();
    }

    public void claimDonation(FoodDonation donation) {
    boolean found = false;

    for (FoodDonation request : requestHistory) {
        if (request.getFoodType().equals(donation.getFoodType()) &&
            request.getExpirationDate().equals(donation.getExpirationDate())) {
            found = true;
            request.reduceQuantity();
            break;
        }
    }
    if (!found) {
        requestHistory.add(new FoodDonation(donation.getFoodType(), 1, donation.getExpirationDate()));
    }
}
    
     public ArrayList<FoodDonation> getClaimedDonations() {
        return claimedDonations;
    }

public ArrayList<FoodDonation> getRequestHistory() {
    return requestHistory; 
}


    public void updateProfile(String newContactInfo) {
        this.contactInfo = newContactInfo;
        System.out.println("Profile updated for recipient: " + name);
    }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }

}
  