package com.bala.unsafes;
public class Unsafe{

    private int value;

    public int getNext(){
        return value++;
    }
}