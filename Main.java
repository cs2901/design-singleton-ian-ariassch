package com.company;
import com.company.ChocolateBoiler;

import java.nio.channels.MulticastChannel;

class Multithread extends Thread
{
    public void run()
    {
        try
        {
            ChocolateBoiler.getInstance();

        }
        catch (Exception e)
        {
            System.out.println ("Exception is caught");
        }
    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int n = 8;
        for (int i=0; i<8; i++)
        {

            Multithread thread = new Multithread();
            thread.start();
            thread.join();
        }

    }
}

