/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;


/**
 *
 * @author Mohamed
 */
public class User {
   private String passWord;
   private String name;
   private String email;
   private String phoneNumber;
   private int rating;
   private double transact;

   public User(String passWord, String name, String email, String phoneNumber, int rating, double transact) {
      this.passWord = passWord;
      this.name = name;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.rating = rating;
      this.transact = transact;
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

   public int getRating() {
      return rating;
   }

   public void setRating(int rating) {
      this.rating = rating;
   }

   public double getTransact() {
      return transact;
   }

   public void setTransact(double transact) {
      this.transact = transact;
   }



 public boolean authenticate(String pass,String email) {
        return (this.passWord.equals(pass) && this.email.equals(email));
    }
 



  
   
}
