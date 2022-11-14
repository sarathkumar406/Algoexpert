package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class qq46 {
    public static void main(String[] args) {
        //System.out.println (Hello.x);

       /* HashMap t = new HashMap ();
        t.put ( null,1 );
        t.put ( 3,2 );
        Set s = t.keySet ();
        Iterator itr = s.iterator ();
        while(itr.hasNext ()){
            System.out.println (itr.next ());
        }*/

      /*  try {
            RandomAccessFile f = new RandomAccessFile ( "myfile.txt", "r" );
            byte b[] = new byte[1000];
            f.readFully ( b,0,1000 );
        } catch (IOException e) {
            throw new RuntimeException ( e );
        }

*/

       // Stream.forEach(name-> System.out.println (name));
    }
}

class Hello{
    final static  int x;
    static {
        x = 20;
        System.out.println ("Static block");
    }
}