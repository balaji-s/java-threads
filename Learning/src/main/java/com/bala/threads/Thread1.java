package com.bala.threads;
public class Thread1 implements Runnable {

    private int []  arrays;

    private static void sum(int [] array){
      long startTime = System.currentTimeMillis();
            int sum = 0;
            for(int i: array){

                sum+=i;
            }

            System.out.println(Thread.currentThread().getName()+":"+(System.currentTimeMillis()-startTime)+":"+sum);

        
    }
    public void run(){
        sum(arrays);
    }

    public Thread1(int[] arrays){

        this.arrays=arrays;

    }

   
    public static void main( String[] args )    {


       int [][]  arrays = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15,16,17},{15,19},{23,34}};

       /*for(int [] array : arrays){
         Thread thread = new Thread(new Thread1(array));
         thread.start();
       }*/
       
        for(int [] array:arrays){
            sum(array);
        }
    }

}