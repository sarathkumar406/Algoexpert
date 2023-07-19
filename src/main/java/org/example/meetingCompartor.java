package org.example;

import java.util.Comparator;

public class meetingCompartor implements Comparator<meeting1> {

    @Override
    public int compare(meeting1 o1, meeting1 o2){

        if(o1.end < o2.end){
            return -1;
        }else if(o1.end > o2.end){
            return 1;
        } else if (o1.pos < o2.pos){
            return -1;
        }
        return 1;
    }
}