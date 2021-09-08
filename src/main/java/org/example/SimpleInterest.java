package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */


import java.util.Scanner;

public class SimpleInterest
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        double principle, rate;
        int years, fin;

        System.out.print( "Enter the principle: " );
        principle = input.nextDouble();
        System.out.print( "Enter the rate of interest: " );
        rate = input.nextDouble();
        System.out.print( "Enter the number of years: " );
        years = input.nextInt();

        fin = (int)Math.round(principle*(1+(rate/100*years)));

        System.out.println("After "+years+" years at "+rate+"%, the investment will be worth $"+fin+".");

    }
}
