/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Booking.BookingFacade;

import java.util.Date;

/**
 *
 * @author lorte
 */
public class Carbooking {

    /**
     * @param args the command line arguments
     */
    
    // Date startDate, Date endDate,int startTime,int endTime,String pickUpStation,String deliveryStation,char typeOfCar,int driverLicenceNumber,String driverName
    public static void main(String[] args) {
        // TODO code application logic here
        BookingFacade bf = new BookingFacade();
        String message = bf.makeBooking("01/01-2019","01/01-2020", 19, 23, "HoChiMinStation", "HoChiMinStation", 'A', 123, "MichaelFriis");
        System.out.println(message);
    }
    
}
