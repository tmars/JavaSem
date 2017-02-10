package com.talipov;

/**
 * Created by Марсель on 10.02.2017.
 */
public class Kvadros extends Prototype {
    public Kvadros(Consumer consumer, int[] data) {
        super(consumer, data);
    }

    protected void calc(int v) {
        consumer.mes(0, v*v,0 );
    }
}
