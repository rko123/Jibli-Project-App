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
public class User {
   private String passWord;
   private String name;
   private String email;
   private String phoneNumber;
   private String prodcutDescr;
   private double price;
   private String location;
   private double profit;
   private String comments;
   private String destination;
   private String departure;
   private Date   depDate;
   private Timer  depTime;

   public User(String passWord, String name, String email, String phoneNumber, String prodcutDescr, double price, String location, double profit, String comments, String destination, String departure, Date depDate, Timer depTime) {
      this.passWord = passWord;
      this.name = name;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.prodcutDescr = prodcutDescr;
      this.price = price;
      this.location = location;
      this.profit = profit;
      this.comments = comments;
      this.destination = destination;
      this.departure = departure;
      this.depDate = depDate;
      this.depTime = depTime;
   }

   public String getPassWord() {
      return passWord;
   }

   public void setPassWord(String passWord) {
      this.passWord = passWord;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public String getProdcutDescr() {
      return prodcutDescr;
   }

   public void setProdcutDescr(String prodcutDescr) {
      this.prodcutDescr = prodcutDescr;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public String getLocation() {
      return location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public double getProfit() {
      return profit;
   }

   public void setProfit(double profit) {
      this.profit = profit;
   }

   public String getComments() {
      return comments;
   }

   public void setComments(String comments) {
      this.comments = comments;
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
 public boolean authenticate(String pass,String email) {
        return (this.passWord.equals(pass) && this.email.equals(email));
    }
 


   @Override
   public String toString() {
      return "User{" + "passWord=" + passWord + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", prodcutDescr=" + prodcutDescr + ", price=" + price + ", location=" + location + ", profit=" + profit + ", comments=" + comments + ", destination=" + destination + ", departure=" + departure + ", depDate=" + depDate + ", depTime=" + depTime + '}';
   }

  
   
}
