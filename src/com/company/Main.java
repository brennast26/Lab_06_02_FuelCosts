package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        String trash = "";
        double GalInTank = 0, FuelEff = 0, PricePerGal = 0;
        double CostPer100Miles = 0, TotalDis = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the amount of gas in the tank in gallons. ");
        if (in.hasNextInt())
        {
            GalInTank = in.nextInt();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must enter a valid input for gallons in tank, "+trash);
            return;
        }
        System.out.print("Please enter the fuel efficiency  of your car. ");
        if (in.hasNextInt())
        {
            FuelEff = in.nextInt();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must enter a valid input for Fuel Efficiency, "+trash);
            return;
        }
        System.out.print("Please enter the current price of gas per gallon. ");
        if (in.hasNextInt())
        {
            PricePerGal = in.nextInt();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must enter a valid input for Price per Gallon, "+trash);
            return;
        }
        CostPer100Miles = (100/FuelEff)*PricePerGal;
        TotalDis = GalInTank*FuelEff;
        System.out.println("The total cost per 100 miles is $"+CostPer100Miles);
        System.out.println("The total distance the car can go with the current amount of gas is "+TotalDis+" miles.");

    }
}
