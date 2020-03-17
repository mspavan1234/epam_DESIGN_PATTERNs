package com.epam.creational_patterns;

import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        GenerateBill gBill = new GenerateBill();
        PrototypeDemo pDemo = new PrototypeDemo();

        gBill.demo();
        pDemo.demo();
    }
}
