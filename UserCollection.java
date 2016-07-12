/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.util.LinkedList;
import java.util.List;


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
      int index = users.indexOf(user);
      return index > 0;
   }
   
      
   

}
