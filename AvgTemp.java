package averageTemperature;
import java.util.Scanner;

public class AvgTemp {
	public static void main(String[] args) {
		//TASK: Calculate Average Temperature (degrees C)	
		//Variables
		int numberOfYears;
		int numberOfMonths;
		final int NUMBER_OF_MONTHS_IN_YEAR = 12;
		int totalTemp = 0;
		double avgTemp;
		//Create a Scanner object to read input
		Scanner keyboard = new Scanner (System.in);
		//Welcome message
		System.out.println("Welcome to the average temperature calculator.");
		System.out.println("The average temperature (C) will be calculated for the nominated number of years and monthly temperatures");
	    //Enter Years
		System.out.print("Enter the number of years (integer):  ");
	    numberOfYears = keyboard.nextInt();
	    //Years less than 1 will exit the system
	    //Must be an integer
	    if (numberOfYears < 1) {
	    	System.out.println("The number of years is less than 1. Program will exit...");
	    	System.exit(0);
	    }
	    //If a valid integer for years was entered, the user will need to type in
	    //The average monthly temperature (C) for each month
	    System.out.println("Enter the average temperature (C) for each month (integer): ");
	    //Nested Loops will ask the user for temperature for each month in each year
	    for (int i = 1; i <= numberOfYears; i++) {
	    	for (int j = 1; j <= NUMBER_OF_MONTHS_IN_YEAR; j++) {
	    		System.out.print("year " + i + " month " + j + ": ");
	    		int currentMonthTemp = keyboard.nextInt();
	    		//totalTemp accumulates for each input
	    		totalTemp += currentMonthTemp;	
	    	}
	    }
	    //Calculations
	    numberOfMonths = numberOfYears * NUMBER_OF_MONTHS_IN_YEAR;
	    avgTemp = totalTemp / numberOfMonths;
	    //Display Results - Number of months, total temperature. and average monthly temperature in degrees Celsius.
	    System.out.println("Number of months: " + numberOfMonths);
	    System.out.println("The total accumulated temperature is: " + totalTemp + " degrees Celsius.");
	    System.out.println("The average monthly temperature is: " + avgTemp + " degrees Celsius.");	
	}
}