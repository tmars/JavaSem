package com.talipov;

/**
 * Created by Марсель on 10.02.2017.
 */
public class Consumer {
    private int value;
    private Sem s3 = new Sem("s3", 1);
    private Sem s2 = new Sem("s2", 1);
    private Sem s1 = new Sem("s1", 1);

    public void mes(int k3, int k2, int k1) {
        if (k3 > 0) {
            s3.get();
            value += k3;
            s3.release();
        }

        if (k2 > 0) {
            s2.get();
            value += k2;
            s2.release();
        }

        if (k1 > 0) {
            s1.get();
            value += k1;
            s1.release();
        }

        System.out.println("Result: " + value);
    }
}
