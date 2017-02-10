package com.talipov;

import java.util.Random;

/**
 * Created by Марсель on 10.02.2017.
 */
public abstract class Prototype implements Runnable {

    protected Consumer consumer;
    int[] data;

    public Prototype(Consumer consumer, int[] data) {
        this.consumer = consumer;
        this.data = data;
    }

    abstract protected void calc(int v);

    private void sleep() {
        Random rand = new Random();
        try {
            Thread.sleep(rand.nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int v: data) {
            sleep();
            this.calc(v);
        }
    }
}
