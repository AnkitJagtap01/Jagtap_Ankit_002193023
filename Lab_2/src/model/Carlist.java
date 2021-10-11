/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ankitjagtap
 */
public class Carlist {
    
    private ArrayList<Car> list;
    private ArrayList<Car> tempList;
    
    public Carlist(){        
        this.list=new ArrayList<Car>();     
        
    }

    public ArrayList<Car> getList() {
        return list;
    }

    public void setList(ArrayList<Car> list) {
        this.list = list;
    }


    
    public Car addNewCar(){
        
        Car newCars = new Car();
        list.add(newCars);
        return newCars;
        
    }
    
    public void deleteCar(Car c){
        list.remove(c);
    }
    
    public ArrayList<Car> searchByBrand(String brand){
        ArrayList<Car> tempList = new ArrayList<Car>();
        for(Car car: getList()){
            if(car.getBrand().contains(brand)){
                tempList.add(car);
            }
        
    }
        return tempList;
    }
    
    public ArrayList<Car> searchByYear(int year){
        ArrayList<Car> tempList = new ArrayList<Car>();
        for(Car car: getList()){
            if(car.getYear() == year){
                tempList.add(car);
            }
        }
        return tempList;
    }
    
    public ArrayList<Car> searchBySeats(int seats){
        ArrayList<Car> tempList = new ArrayList<Car>();
        for(Car car: getList()){
            if(car.getSeats() == seats){
                tempList.add(car);
            }
        }
        return tempList;
    }
    
    public ArrayList<Car> searchByModel(String modelNum){
        ArrayList<Car> tempList = new ArrayList<Car>();
        for(Car car: getList()){
            if(car.getModelNum().contains(modelNum)){
                tempList.add(car);
            }
        
    }
        return tempList;
    }
    
    public ArrayList<Car> searchByCity(String city){
        ArrayList<Car> tempList = new ArrayList<Car>();
        for(Car car: getList()){
            if(car.getCity().contains(city)){
                tempList.add(car);
            }
        
    }
        return tempList;
    }
    
        public ArrayList<Car> searchByAvailability(Boolean carAvailable){
        ArrayList<Car> tempList = new ArrayList<Car>();
        for(Car car: getList()){
            if(car.getCarAvailable() == carAvailable){
                tempList.add(car);
            }
        
    }
        return tempList;
    }
        
        public ArrayList<Car> searchFirstAvailableCar(Boolean carAvailable){
        ArrayList<Car> tempList = new ArrayList<Car>();
        for(Car car: getList()){
            if(car.getCarAvailable() == true){
                tempList.add(car);
                break;
            }
        
    }
        return tempList;
    }
        
        public ArrayList<Car> searchByMaintenence(Boolean maintenenceCert){
        ArrayList<Car> tempList = new ArrayList<Car>();
        for(Car car: getList()){
            if(car.getMaintenanceCert() == maintenenceCert){
                tempList.add(car);
            }
        
    }
        return tempList;
    }
        
        public ArrayList<Car> searchByUsability(Boolean usedByUber){
        ArrayList<Car> tempList = new ArrayList<Car>();
        for(Car car: getList()){
            if(car.getUsedByUber() == usedByUber){
                tempList.add(car);
            }
        
    }
        return tempList;
    }
        
        public ArrayList<Car> searchBySerial(int serialNum){
        ArrayList<Car> tempList = new ArrayList<Car>();
        for(Car car: getList()){
            if(car.getSerialNum() == serialNum){
                tempList.add(car);
            }
        }
        return tempList;
    }
        
        public ArrayList<Car> findCarsMinMaxSeats(int seats, int min, int max){
            ArrayList<Car> tempList = new ArrayList<Car>();
            for(Car car: getList()){
            if (car.getSeats() >= min && car.getSeats()<= max){ 
                tempList.add(car);
            }
        }
        return tempList;
        }
        
    public void deleteEntry(int serialNum) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (Car car : list) {
            if (car.getSerialNum() == serialNum) {
                list.remove(car);
                break;
            }

        }
    }
    
//        public Car searchCar(int id) {
//        for (Car car : carList) {
//            if (car.getModelNum() == id) {
//                return car;
//            }
//        }
//        return null;
//    }
    
}
