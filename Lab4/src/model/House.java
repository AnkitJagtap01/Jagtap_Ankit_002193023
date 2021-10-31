/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ankitjagtap
 */
public class House {
    
    private String streetName;
    private String apartmentName;
    private City city;
    private String state;
    private int zip; 
    
        public House(String sName, String aName, City c, String state, int zip){
        
        
        this.streetName = sName;
        this.apartmentName = aName;
        this.city = c;
        this.state = state;
        this.zip = zip;
        java.lang.System.out.println("house"+this.streetName + this.apartmentName);
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    
    
    
}
