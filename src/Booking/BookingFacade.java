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
public class BookingFacade {
    
    Controller con;
    
    public String makeBooking(String startDate, String endDate,int startTime,int endTime,String pickUpStation,String deliveryStation,char typeOfCar,int driverLicenceNumber,String driverName){
        
        con = new Controller();
        return con.makeBooking(startDate, endDate, startTime, endTime, pickUpStation, deliveryStation, typeOfCar, driverLicenceNumber, driverName);
        
        
    }
    
    
}
