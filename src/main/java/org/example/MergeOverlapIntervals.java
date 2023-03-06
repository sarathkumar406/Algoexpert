package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlapIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{4,7},{6,8},{9,10}};
       int[][] res =  mergeOverlap(intervals);

        System.out.println (Arrays.toString ( res[0] ));
        System.out.println (Arrays.toString ( res[1] ));
        System.out.println (Arrays.toString ( res[2] ));

    }

    private static int[][] mergeOverlap(int[][] intervals) {

        int[][] sortedIntervals = intervals.clone ();
        Arrays.sort (sortedIntervals, (a,b) -> Integer.compare ( a[0],b[0] ));

        List<int[]> mergedIntervals = new ArrayList<> ();
        int[] currentIntervals = sortedIntervals[0];
        mergedIntervals.add ( currentIntervals );

        for(int[] nextIntervals : sortedIntervals){
            int currentIntervalEnd = currentIntervals[1];
            int nextIntervalStart = nextIntervals[0];
            int nextIntervalEnd = nextIntervals[1];


            if(currentIntervalEnd >= nextIntervalStart){
                currentIntervals[1]  = Math.max(currentIntervalEnd,nextIntervalEnd);
            } else {
                currentIntervals = nextIntervals;
                mergedIntervals.add ( currentIntervals );
            }
        }
        return mergedIntervals.toArray (new int[mergedIntervals.size ()][]);
    }
}
