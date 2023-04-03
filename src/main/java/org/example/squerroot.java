package org.example;

public class squerroot {
    public static void main(String[] args) {

        int val = 8;

        long r = val;
        while(r * r > val){
            r = (r+val/r)/2;
        }
        System.out.println ((int)r);
    }
}
