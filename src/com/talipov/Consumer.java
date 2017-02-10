package com.talipov;

/**
 * Created by Марсель on 10.02.2017.
 */
public class Consumer {
    private volatile int value;
    private Sem s3 = new Sem("s3", 1);
    private Sem s2 = new Sem("s2", 1);
    private Sem s1 = new Sem("s1", 1);

    public void mes(int k3, int k2, int k1) {
        if (k3 > 0) {
           add(s3, k3);
        } else if (k2 > 0) {
            add(s3, k3);
        } else if (k1 > 0) {
            add(s3, k3);
        }

        System.out.println("Result: " + value);
    }

    private void add(Sem s, int v) {
        s.get();
        value += v;
        s.release();
    }
}
