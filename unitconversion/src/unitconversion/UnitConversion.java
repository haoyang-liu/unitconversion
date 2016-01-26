package unitconversion;

import java.util.Scanner;

public class UnitConversion
	{
		double deviaition;
		double difference;
		
		public static void main(String[] args)
			{
				double feetInput = inputFeet();
				double inchesInput = inputInches();
				double justInches = convertToJustInches(feetInput,inchesInput);
				double centimeters = convertToCentimeters(justInches);
				double meters = convertToMeters(centimeters);
				double feet = convertToFeet(meters);
				double inches = convertToInches(feet);
				calculateDeviation(inches, justInches);
			}
		
		private static double inputFeet()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Please input the number of your height in feet.");
				return userInput.nextDouble();
			}
		
		private static double inputInches()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Please input the number of your additional inches.");
				return userInput.nextDouble();
			}
		
		private static double convertToJustInches(double feetInput, double inchesInput)
			{
				double justInches = (feetInput * 12) + (inchesInput);
				System.out.println("That equals " + justInches + " inches.");
				return justInches;
			}
		
		private static double convertToCentimeters(double justInches)
			{
				double centimeters = justInches * 2.54;
				System.out.println("That equals " + centimeters + " centimeters.");
				return centimeters;
			}
		
		private static double convertToMeters(double centimeters)
			{
				double meters = centimeters * 0.01;
				System.out.println("That equals " + meters + " meters.");
				return meters;
			}
		
		private static double convertToFeet(double meters)
			{
				double feet = meters * 3.28;
				System.out.println("That equals " + feet + " feet.");
				return feet;
			}
		
		private static double convertToInches(double feet)
			{
				double inches = feet * 12;
				System.out.println("That equals " + inches + " inches.");
				return inches;
			}
		
		private static void calculateDeviation(double inches, double justInches)
			{
				double difference = (inches - justInches);
				double deviation = Math.abs((difference / justInches)*100);
				System.out.println("The deviation is " + deviation + "%.");
			}
		
		
		
		

	}
