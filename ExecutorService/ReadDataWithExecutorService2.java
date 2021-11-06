//In this code I am using FileReader and FileWriter classes,it reads data character by character


package com.company.executorserviceexample;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.io.*;

class Task1 implements Runnable{

    public void run()
    {
        File f=new File("sample1.txt");
        if(f.exists())
        {
            try
            {
                FileReader fr=new FileReader("sample1.txt");
                //FileWriter fw=new FileWriter("temp.txt");

                int l=(int)f.length();
                char c[]=new char[l];
                fr.read(c);
                String s=new String(c);
                System.out.println(s);

            }
            catch(IOException e)
            {
                System.out.println(e);
            }
        }
        else
        {
            System.out.println("File not found");
        }
    }
}
public class ReadDataWithExecutorService2 {

    public static void main(String[] args) {

        ScheduledExecutorService s1=new ScheduledThreadPoolExecutor(0);
        s1.scheduleAtFixedRate(new Task1(),5,5, TimeUnit.SECONDS);
    }
}
