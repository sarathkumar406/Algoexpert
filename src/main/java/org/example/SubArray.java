package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArray {
    public static void main(String[] args) {

        int[] arr = {-5,-5,2,3,-2};
        List<int[]> res = subArray(arr);
        for(int i =0;i<res.size ();i++){
            int[] ar = res.get ( i );
           // System.out.println ( Arrays.toString (ar));
            int sum = 0;
            for(int j=0;j< ar.length;j++){
                sum += ar[j];
            }
            if(sum == 0) {
                System.out.println ( true );
                return;
            }
            else{
                continue;
            }

        }
    }

    private static List<int[]> subArray(int[] arr) {

        List<int[]> subarrays = new ArrayList<> ();

        for(int i =0;i<arr.length;i++){
            for(int j =i;j<arr.length; j++){
                int[] subarray = new int[j-i+1];
                for(int k = i;k<=j;k++){
//                    System.out.print (arr[k]+" ");
                    subarray[k-i] = arr[k];
                }
                subarrays.add ( subarray );
//                System.out.println ();
            }
        }
        return subarrays;
    }
}
