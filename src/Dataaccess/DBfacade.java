/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dataaccess;

/**
 *
 * @author lorte
 */
public class DBfacade {
    
    public String makeBooking(Object booking){
        Database db = new Database();
        return db.saveBooking(booking); 
    }
    
}
