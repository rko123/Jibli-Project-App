/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.util.Date;

/**
 *
 * @author Mohamed
 */
public class Announce {
   private String product;
   private double price;
   private double profit;
   private String location;
   private Date   postdatetime;
   private String comment;

   public Announce(String product, double price, double profit, String location, Date postdatetime, String comment) {
      this.product = product;
      this.price = price;
      this.profit = profit;
      this.location = location;
      this.postdatetime = postdatetime;
      this.comment = comment;
   }

   public String getProduct() {
      return product;
   }

   public void setProduct(String product) {
      this.product = product;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public double getProfit() {
      return profit;
   }

   public void setProfit(double profit) {
      this.profit = profit;
   }

   public String getLocation() {
      return location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public Date getPostdatetime() {
      return postdatetime;
   }

   public void setPostdatetime(Date postdatetime) {
      this.postdatetime = postdatetime;
   }

   public String getComment() {
      return comment;
   }

   public void setComment(String comment) {
      this.comment = comment;
   }

   @Override
   public String toString() {
      return "Announce{" + "product=" + product + ", price=" + price + ", profit=" + profit + ", location=" + location + ", postdatetime=" + postdatetime + ", comment=" + comment + '}';
   }
   
   
   
}
