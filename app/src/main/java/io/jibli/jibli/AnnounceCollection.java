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
public class AnnounceCollection {
     List<Announce> announces;


    public AnnounceCollection() {
        this.announces = new LinkedList<>();
    }

    public boolean addmessage(Announce ano) {
        return announces.add(ano);
    }

    public boolean removemessage(Announce ano) {
        return announces.remove(ano);
    }

    public void modifyAnnounce(Announce search, Announce newMsg) {
   
        int index = announces.indexOf(search);
        if (index >= 0) {
            announces.set(index, newMsg);
        }
    }

   

    @Override
    public String toString() {
        String str = "";
        ListIterator<Announce> iter = announces.listIterator();
        while (iter.hasNext()) {
            Announce st = iter.next();
            str += st.toString() + "\n";
        }
        return str;
    }

    public ListIterator<Announce> getStudents() {
        return announces.listIterator();
    }



    

}
