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
public class JourneyCollection {
      List<Journey> journeys;


    public JourneyCollection() {
        this.journeys = new LinkedList<>();
    }

    public boolean addmessage(Journey jour) {
        return journeys.add(jour);
    }

    public boolean removemessage(Journey jour) {
        return journeys.remove(jour);
    }

    public void modifyJourney(Journey search, Journey newMsg) {
   
        int index = journeys.indexOf(search);
        if (index >= 0) {
            journeys.set(index, newMsg);
        }
    }

   

    @Override
    public String toString() {
        String str = "";
        ListIterator<Journey> iter = journeys.listIterator();
        while (iter.hasNext()) {
            Journey st = iter.next();
            str += st.toString() + "\n";
        }
        return str;
    }

    public ListIterator<Journey> getStudents() {
        return journeys.listIterator();
    }

}
