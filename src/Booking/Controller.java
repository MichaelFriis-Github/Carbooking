/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Booking;

import Dataaccess.DBfacade;


/**
 *
 * @author lorte
 */
public class Controller {
    
    DBfacade dbfacade;
    
    
    public String makeBooking(String startDate, String endDate,int startTime,int endTime,String pickUpStation,String deliveryStation,char typeOfCar,int driverLicenceNumber,String driverName){
        
       Booking book = new Booking(startDate, endDate, startTime, endTime, pickUpStation,deliveryStation,typeOfCar,driverLicenceNumber,driverName);
       dbfacade = new DBfacade();
       return dbfacade.makeBooking(book);
    }
    
}
