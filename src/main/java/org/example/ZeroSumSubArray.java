package org.example;

import javax.lang.model.type.IntersectionType;
import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        System.out.println (sumSubArray(arr));

    }

    private static boolean sumSubArray(int[] arr) {
        Set<Integer> sums = new HashSet<> ();
        int currentSum = 0;
        for(int i : arr){
            currentSum += i;
            if(i==0 || currentSum == 0 || !sums.add ( currentSum )) {
                return true;
            }
        }
        return false;
    }
}
