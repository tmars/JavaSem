package com.talipov;

/**
 * Created by Марсель on 10.02.2017.
 */
public class Kubes extends Prototype {
    public Kubes(Consumer consumer, int[] data) {
        super(consumer, data);
    }

    protected void calc(int v) {
        consumer.mes(v*v*v, 0,0 );
    }
}
