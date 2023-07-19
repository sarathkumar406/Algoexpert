package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Meeting {

    public static void maxMeetings(int start[], int end[], int n){

        ArrayList<meeting1>  meet = new ArrayList<> ();

        for(int i =0; i< start.length;i++)
            meet.add ( new meeting1 ( start[i],end[i], i+1 ) );


        meetingCompartor mc = new meetingCompartor ();
        Collections.sort(meet,mc);
        ArrayList<Integer> ans = new ArrayList<> ();
        ans.add ( meet.get ( 0 ).pos );
        int limit = meet.get ( 0 ).end;

        for(int i = 1;i<start.length;i++){
            if(meet.get ( i ).start > limit){
                ans.add ( meet.get ( i ).pos );
                limit = meet.get ( i ).end;
            }
        }

        for(int i =0;i<ans.size ();i++){
            System.out.print (ans.get ( i )+"  ");
        }
    }

    public static void main(String[] args) {
        int n = 6;
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,5,7,9,9};
        maxMeetings ( start,end,n );
    }
}
