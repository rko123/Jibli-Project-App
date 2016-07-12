/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.jibli.jibli;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


/**
 *
 * @author Mohamed
 */
   

public class UserCollection {
   
   static List<User> users;
   
   public UserCollection(){
      users=new LinkedList<>();
   }
   public void addMember(User m){
      
      users.add(m);
   }
   public void removeUser(User m){
      
      users.remove(m);
   }
   public void editUser(User user,User newObject)
   {
      
      users.set(users.indexOf(user), newObject);
   }
 
   public boolean authenticateUser (User user)
   {
        ListIterator<User> iter = users.listIterator();
        while (iter.hasNext()) {
            User us = iter.next();
            if (us.getPassWord().equals(user.getPassWord()) && user.getEmail().equalsIgnoreCase(user.getEmail())) {
               return true;
            } 
        }
       return false;
 
   }
   
      
   

}
