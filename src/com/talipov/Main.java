package com.talipov;

public class Main {

    public static void main(String[] args) {
      int[] a = new int[]{2,3,4,5, 6, 7, 8};
      int[] b = new int[]{2,4,6,8, 10,12,14};
      int[] c = new int[]{3,6,9,12,15,18,21};

//        int[] a = new int[]{2,3,4};
//	    int[] b = new int[]{2,4,6};
//	    int[] c = new int[]{3,6,9};

	    Consumer consumer = new Consumer();

        Prototype k3 = new Kubes(consumer, a);
        Prototype k2 = new Kvadros(consumer, b);
        Prototype k1 = new Protos(consumer, c);

        Thread t1 = new Thread(k3);
        t1.start();

        Thread t2 = new Thread(k2);
        t2.start();

        Thread t3 = new Thread(k1);
        t3.start();

        Thread t12 = new Thread(k3);
        t12.start();

        Thread t22 = new Thread(k2);
        t22.start();

        Thread t32 = new Thread(k1);
        t32.start();
    }
}
