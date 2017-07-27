package com.bala.threads;

import org.junit.Test;

import com.bala.unsafes.UnsafeThread;


import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
       // assertTrue( true );
    }

    @Test
    public void happypath(){

        Thread [] threads = new Thread[10];
        for(Thread thread: threads){
            thread = new Thread(new UnsafeThread());
            thread.start();
        }
    }

    
}
