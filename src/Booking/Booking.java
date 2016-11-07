/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Booking;



/**
 *
 * @author lorte
 */
public class Booking implements java.io.Serializable{
    
    String startDate;
    String endDate;
    int starttime;
    int endtime;
    String pickUpStation;
    String deliveryStation;
    char typeOfCar;
    int driverLicenceNumber;
    String driverName;

    public Booking(String startDate, String endDate, int starttime, int endtime, String pickUpStation, String deliveryStation, char typeOfCar, int driverLicenceNumber, String driverName) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.starttime = starttime;
        this.endtime = endtime;
        this.pickUpStation = pickUpStation;
        this.deliveryStation = deliveryStation;
        this.typeOfCar = typeOfCar;
        this.driverLicenceNumber = driverLicenceNumber;
        this.driverName = driverName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getStarttime() {
        return starttime;
    }

    public void setStarttime(int starttime) {
        this.starttime = starttime;
    }

    public int getEndtime() {
        return endtime;
    }

    public void setEndtime(int endtime) {
        this.endtime = endtime;
    }

    public String getPickUpStation() {
        return pickUpStation;
    }

    public void setPickUpStation(String pickUpStation) {
        this.pickUpStation = pickUpStation;
    }

    public String getDeliveryStation() {
        return deliveryStation;
    }

    public void setDeliveryStation(String deliveryStation) {
        this.deliveryStation = deliveryStation;
    }

    public char getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(char typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public int getDriverLicenceNumber() {
        return driverLicenceNumber;
    }

    public void setDriverLicenceNumber(int driverLicenceNumber) {
        this.driverLicenceNumber = driverLicenceNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    
    
    
    
}
