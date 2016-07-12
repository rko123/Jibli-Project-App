/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;


import java.util.Date;
import java.util.Timer;

/**
 *
 * @author Mohamed
 */
public class Bringer extends User {
   private String destination;
   private String departure;
   private Date   depDate;
   private Timer  depTime;

   public Bringer(String destination, String departure, Date depDate, Timer depTime, String userName, String passWord, String name, String email, String phoneNumber) {
      super(userName, passWord, name, email, phoneNumber);
      this.destination = destination;
      this.departure = departure;
      this.depDate = depDate;
      this.depTime = depTime;
   }

  

   public String getDestination() {
      return destination;
   }

   public void setDestination(String destination) {
      this.destination = destination;
   }

   public String getDeparture() {
      return departure;
   }

   public void setDeparture(String departure) {
      this.departure = departure;
   }

   public Date getDepDate() {
      return depDate;
   }

   public void setDepDate(Date depDate) {
      this.depDate = depDate;
   }

   public Timer getDepTime() {
      return depTime;
   }

   public void setDepTime(Timer depTime) {
      this.depTime = depTime;
   }

   @Override
   public String toString() {
      return "Bringer{" + "destination=" + destination + ", departure=" + departure + ", depDate=" + depDate + ", depTime=" + depTime + '}';
   }
   
   

   
   
}
