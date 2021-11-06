//In this code I am using BufferedReader and BufferedWriter classes,it reads data character by character


package com.company.executorserviceexample;

import java.io.*;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class Task2 implements Runnable{

    public void run()
    {
        File f=new File("sample1.txt");
        if(f.exists())
        {
            try
            {
                BufferedReader br=new BufferedReader(new FileReader("sample1.txt"));
                BufferedWriter fr=new BufferedWriter(new FileWriter("temp.txt"));

                String s;
                while((s=br.readLine())!=null)
                {
                    String w[]=s.split(";");
                    for(String p:w)
                    {
                        System.out.println(p);
                    }
                }


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

public class ReadDataWithExecutorService3 {

    public static void main(String[] args) {

        ScheduledExecutorService s1=new ScheduledThreadPoolExecutor(0);
        s1.scheduleAtFixedRate(new Task2(),5,5, TimeUnit.SECONDS);
    }


}
