package org.example;

import java.util.concurrent.SynchronousQueue;

public class Sample {
    public static void main(String[] args) {
        /*System.out.print ("1 ");
        synchronized (args){
            System.out.print ("2 ");
            try {
                args.wait ();
            }catch (InterruptedException e){}
        }
        System.out.print ("3 ");*/

       /* try {
            int a[] = new int[1];
            a[1] = 30/0;
            a[2] = 50;
        }catch (ArithmeticException e ) {
            System.out.println ("Exception 1");
        } catch (ArrayIndexOutOfBoundsException e ){
            System.out.println ("Exception 2");
        }catch (Exception e){
            System.out.println ("Exetipn 3");
        }
        System.out.println ("test");*/

        Thread t = new Thread (){
            Foo f = new Foo ();
            public void  run(){
                f.increase ( 20 );
            }
        };
        t.start ();
    }
}
class Foo {
    private int data = 23;
    public void increase(int amt){
        int x = data;
        data = x+amt;
    }
}