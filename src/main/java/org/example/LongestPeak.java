package org.example;

public class LongestPeak {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 2, 1};
        System.out.println (longestPeak(arr));

    }
    private static int longestPeak(int[] arr) {

        int longestPeakLength = 0;
        int i = 1;
        while(i < arr.length-1){
            boolean isPeak = arr[i-1] < arr[i] && arr[i] > arr[i+1];
            if(!isPeak){
                i+=1;
                continue;
            }

            int leftIdx = i - 2;
            while(leftIdx >= 0 && arr[leftIdx] < arr[leftIdx + 1]){
                leftIdx -= 1;
            }

            int rightIdx = i + 2;
            while(rightIdx < arr.length && arr[rightIdx]  < arr[rightIdx - 1]){
                rightIdx += 1;
            }

            int currentPeakLength = rightIdx - leftIdx - 1;
            if(currentPeakLength > longestPeakLength){
                longestPeakLength = currentPeakLength;
            }
            i = rightIdx;
        }
        return longestPeakLength;
    }
}
