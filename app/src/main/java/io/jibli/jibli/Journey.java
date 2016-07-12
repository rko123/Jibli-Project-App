/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.jibli.jibli;


import java.util.Date;

/**
 *
 * @author Mohamed
 */
public class Journey {
   private Date date;
   private String dest;
   private String depar;

   public Journey(Date date, String dest, String depar) {
      this.date = date;
      this.dest = dest;
      this.depar = depar;
   }

   public Date getDate() {
      return date;
   }

   public void setDate(Date date) {
      this.date = date;
   }

   public String getDest() {
      return dest;
   }

   public void setDest(String dest) {
      this.dest = dest;
   }

   public String getDepar() {
      return depar;
   }

   public void setDepar(String depar) {
      this.depar = depar;
   }

   @Override
   public String toString() {
      return "Journey{" + "date=" + date + ", dest=" + dest + ", depar=" + depar + '}';
   }
   
   
   
   
   
}
