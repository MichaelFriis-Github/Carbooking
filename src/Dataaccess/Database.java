/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dataaccess;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author lorte
 */
public class Database {

    public String saveBooking(Object booking) throws FileNotFoundException, IOException {

        try {
         FileOutputStream fileOut =
         new FileOutputStream("booking.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(booking);
         out.close();
         fileOut.close();
         return "succes";
      }catch(IOException i) {
         i.printStackTrace();
         return "fail";
      }
    }

}
