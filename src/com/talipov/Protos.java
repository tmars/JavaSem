package com.talipov;

/**
 * Created by Марсель on 10.02.2017.
 */
public class Protos extends Prototype {
    public Protos(Consumer consumer, int[] data) {
        super(consumer, data);
    }

    protected void calc(int v) {
        consumer.mes(0, 0,v);
    }
}
