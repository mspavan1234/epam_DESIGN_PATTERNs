package com.epam.behavioural_patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrategyPatternDemo {
    public static void demo() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first value: ");
        float value1 = Float.parseFloat(br.readLine());
        System.out.print("Enter the second value: ");
        float value2 = Float.parseFloat(br.readLine());
        Context context = new Context(new Subtraction());

        System.out.println("Subtraction = " + context.executeStrategy(value1, value2));

        context = new Context(new Division());
        System.out.println("Division = " + context.executeStrategy(value1, value2));

    }

}
