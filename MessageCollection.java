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
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class MessageCollection {

   
    List<Message> messages;


    public MessageCollection() {
        this.messages = new LinkedList<>();
    }

    public boolean addmessage(Message msg) {
        return messages.add(msg);
    }

    public boolean removemessage(Message msg) {
        return messages.remove(msg);
    }
    
    public ArrayList<Message>  retrieveconversation (int userid)
    {
        ListIterator<Message> iter = messages.listIterator();
        ArrayList<Message> results = new ArrayList<>();
        while (iter.hasNext()) {
            Message ms = iter.next();
             if (ms.getSender_ID()==userid) {
               results.add(ms);
             }
             else if (ms.getReceiver_ID()==userid)
                results.add(ms); 
        }
           
        return results;  
    }
 
    
    public void modifyMessage(Message search, Message newMsg) {
   
        int index = messages.indexOf(search);
        if (index >= 0) {
            messages.set(index, newMsg);
        }
    }
  
    @Override
    public String toString() {
        String str = "";
        ListIterator<Message> iter = messages.listIterator();
        while (iter.hasNext()) {
            Message st = iter.next();
            str += st.toString() + "\n";
        }
        return str;
    }

    public ListIterator<Message> getStudents() {
        return messages.listIterator();
    }

   

}
