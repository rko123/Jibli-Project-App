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
   private String userName;
   private String passWord;
   private String name;
   private String email;
   private String phoneNumber;

   public User(String userName, String passWord, String name, String email, String phoneNumber) {
      this.userName = userName;
      this.passWord = passWord;
      this.name = name;
      this.email = email;
      this.phoneNumber = phoneNumber;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
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

   @Override
   public String toString() {
      return "User{" + "userName=" + userName + ", passWord=" + passWord + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + '}';
   }


   
}
