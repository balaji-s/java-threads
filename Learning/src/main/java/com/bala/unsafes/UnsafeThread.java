package com.bala.unsafes;



public class UnsafeThread implements Runnable{

    private Unsafe unsafe;

    public UnsafeThread(){
        unsafe = new Unsafe();
    }
    public void run(){
      System.out.println(unsafe.getNext());
    }
    
  
}