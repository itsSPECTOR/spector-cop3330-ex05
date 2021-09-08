package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Reese Spector
 */

public class App 
{
    public static void main( String[] args )
    {
        // scanner
        Scanner input = new Scanner(System.in);

        // take number one
        System.out.print("What is the first number? ");
        String strOne = input.nextLine();
        int numOne = Integer.parseInt(strOne);

        // take number two
        System.out.print("What is the second number? ");
        String strTwo = input.nextLine();
        int numTwo = Integer.parseInt(strTwo);

        //print
        System.out.print(
            //sum
                numOne + " + " + numTwo + " = " + (numOne + numTwo) + "\n" +
            //dif
                numOne + " - " + numTwo + " = " + (numOne - numTwo) + "\n" +
            //prod
                numOne + " * " + numTwo + " = " + (numOne * numTwo) + "\n" +
            //quo
                numOne + " / " + numTwo + " = " + (numOne / numTwo) + "\n"
        );
    }
}
