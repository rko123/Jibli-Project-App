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
    public void assigneMessage (Message msg)
    {
        ListIterator<Message> iter = messages.listIterator();
        while (iter.hasNext()) {
            Message ms = iter.next();
            if (ms.getReceiver_ID().equalsIgnoreCase(msg.getReceiver_ID())) {
                ms.setContent(msg.getContent());
            }
        }

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
