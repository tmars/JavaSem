package com.talipov;

/**
 * Created by Марсель on 10.02.2017.
 */
public class Sem {
    private volatile int count;
    private String name;

    public Sem(String name, int count) {
        this.count = count;
        this.name = name;
    }

    void get() {
        if (count == 0) {
            System.out.println(name+ " is waiting.");
            while (count == 0) {};
        }
        count--;
    }

    void release() {
        count++;
    }
}
