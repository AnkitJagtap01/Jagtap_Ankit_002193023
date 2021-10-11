/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.util.Collections.list;

/**
 *
 * @author ankitjagtap
 */
public class Car {
    
//1. Find me the first available passenger car. Boolean available 
//2. How many cars are currently available. How many are not. Int numberOfCars
//3. List all cars that are made by Toyota, GM, etc. String brand
//4. List all cars that were manufactured in a given year, ‘x’. Int year
//5. List all cars with a minimum of x seats but no more than y seats. Int seats
//6. Find a car with the given serial number. List the attributes of the found car. Int serialNum
//7. List all cars given the model number. String modelNum
//8. List all the car manufacturers used by the (this) Uber. Boolean usedByUber
//9. When was the last time the fleet catalog was updated. Date updateTime--wip
//10. List all cars that are available in a given city. String city
//11. List all cars that have expired maintenance certificate. Boolean maintenanceCert
    
    
    private Boolean carAvailable;
    private String brand;
    private int year;
    private int seats;
    private int min;
    private int max;
    private int serialNum;
    private String modelNum;
    private Boolean usedByUber;
    private String time;
    private String city;
    private Boolean maintenanceCert;
    private static int count = 0;
    
    public Car() {
        count++;
        serialNum = count;
    }

    public Boolean getCarAvailable() {
        return carAvailable;
    }

    public void setCarAvailable(Boolean carAvailable) {
        this.carAvailable = carAvailable;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public Boolean getUsedByUber() {
        return usedByUber;
    }

    public void setUsedByUber(Boolean usedByUber) {
        this.usedByUber = usedByUber;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getMaintenanceCert() {
        return maintenanceCert;
    }

    public void setMaintenanceCert(Boolean maintenanceCert) {
        this.maintenanceCert = maintenanceCert;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString(){
        return brand;
    }
    
}
