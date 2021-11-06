//In this code I am using FileInputStream and FileOutputStream classes,it reads data character by character
package com.company.executorserviceexample;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.io.*;

class Task implements Runnable
{
    public void run()
    {

        File f1=new File("sample1.txt");
        if(f1.exists())
        {
            try
            {
                FileInputStream fis=new FileInputStream("sample1.txt");
                //FileOutputStream fos=new FileOutputStream("temp.txt");

                int  c;
                while((c=fis.read())!=-1)
                {
                    //fos.write((char)c);
                    System.out.print((char)c);
                }
                System.out.println();
                System.out.println();
                fis.close();
                //fos.close();
            }
            catch(IOException e)
            {
                System.out.println(e);
            }

        }
        else
        {
            System.out.println("file not found");
        }
    }
}
public class ReadDataWithExecutorService1 {

    public static void main(String[] args) {

        ScheduledExecutorService s1= Executors.newScheduledThreadPool(0);

        //task to run repeatedly every 10 seconds
        s1.scheduleAtFixedRate(new Task(),5,5, TimeUnit.SECONDS);
    }
}
