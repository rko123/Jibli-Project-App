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
public class Message {
   private String content;
   private Date date;
   private String sender_ID;
   private String receiver_ID;

   public Message(String content, Date date, String sender_ID, String receiver_ID) {
      this.content = content;
      this.date = date;
      this.sender_ID = sender_ID;
      this.receiver_ID = receiver_ID;
   }

   public String getContent() {
      return content;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public Date getDate() {
      return date;
   }

   public void setDate(Date date) {
      this.date = date;
   }

   public String getSender_ID() {
      return sender_ID;
   }

   public void setSender_ID(String sender_ID) {
      this.sender_ID = sender_ID;
   }

   public String getReceiver_ID() {
      return receiver_ID;
   }

   public void setReceiver_ID(String receiver_ID) {
      this.receiver_ID = receiver_ID;
   }
   
   @Override
   public String toString() {
      return "Message{" + "content=" + content + ", date=" + date + ", sender_ID=" + sender_ID + ", receiver_ID=" + receiver_ID + '}';
   }
   
   
}
