package CountriesLab;

import java.util.Scanner;

import interfacedemo.SampleValidator;


public class CountriesApp {

	public static void main (String [] args) {
		
		int scan;
		int userChoice1=0;
		String answer;
							
		System.out.println("Welcome to the counties list");
		
		do {
		System.out.println("Would you like to:");
		System.out.println("1) Read a list of countries?");
		System.out.println("2) Add to the list of countries?");
		System.out.println("3) Exit the program?");
		System.out.println();
		Scanner in = new Scanner(System.in);
		userChoice1= SampleValidator.getInt(in,"Please enter 1, 2, or 3",1,3 );
		
	
		
		if (userChoice1 == 1) {
			CountriesTextFile.readFromFile(CountriesTextFile.fileName);
		}else if (userChoice1 == 2) {
			CountriesTextFile.writeToFile(CountriesTextFile.fileName);
		}else if (userChoice1 == 3) {
			System.out.println("Goodbye");
			System.exit(0);
		}
		System.out.println("Do you want to continue? (y/n)");
		answer = in.next();
		}while (answer.equalsIgnoreCase("y"));
		
		System.out.println("Goodbye");
}
}