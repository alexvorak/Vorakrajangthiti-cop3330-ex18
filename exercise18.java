/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */

import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args)
    {
        System.out.print("Press C to convert from Fahrenheit to Celsius\nPress F to convert from Celsius to Fahrenheit\nYour Choice: ");
        Scanner scanner = new Scanner(System.in);
        String metric = scanner.nextLine();


        switch(metric)
        {
            case "C":
                System.out.print("Please enter the temperature in Fahrenheit: ");
                Scanner scanner1 = new Scanner(System.in);
                String fah = scanner1.nextLine();
                int newfah = Integer.parseInt(fah);
                int celconv = ((newfah-32)*5)/9;
                System.out.printf("The temperature in Celsius is "+celconv);
                break;
            case "c":
                System.out.print("Please enter the temperature in Fahrenheit: ");
                Scanner scanner4 = new Scanner(System.in);
                String fah2 = scanner4.nextLine();
                int newfah2 = Integer.parseInt(fah2);
                int celconv2 = ((newfah2-32)*5)/9;
                System.out.printf("The temperature in Celsius is "+celconv2);
                break;
            case "f":
                System.out.print("Please enter the temperature in Celsius: ");
                Scanner scanner5 = new Scanner(System.in);
                String celly2 = scanner5.nextLine();
                int newcel2 = Integer.parseInt(celly2);
                int fahconv2 = ((newcel2*9)/5)+32;
                System.out.printf("The temperature in Celsius is "+fahconv2);
                break;
            case "F":
                System.out.print("Please enter the temperature in Celsius: ");
                Scanner scanner2 = new Scanner(System.in);
                String celly = scanner2.nextLine();
                int newcel = Integer.parseInt(celly);
                int fahconv = ((newcel*9)/5)+32;
                System.out.printf("The temperature in Celsius is "+fahconv);
                break;
        }



    }
}
