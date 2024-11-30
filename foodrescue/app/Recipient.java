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

    public Recipient(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.claimedDonations = new ArrayList<>();
    }

    public void claimDonation(FoodDonation donation) {
        claimedDonations.add(donation);
        System.out.println("Claimed donation: " + donation.getFoodType());
    }

    public void updateProfile(String newContactInfo) {
        this.contactInfo = newContactInfo;
        System.out.println("Profile updated for recipient: " + name);
    }

    public ArrayList<FoodDonation> getClaimedDonations() {
        return claimedDonations;
    }


    public String getName() { return name; }
    public String getContactInfo() { return contactInfo; }
    public void setName(String name) { this.name = name; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }
}