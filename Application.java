//package com.testing.naveed.maven.java;
import Cal_fts.Adder;
import java.util.Scanner;  // Import the Scanner class
public class Application {

    public static void main(String[] args) {
		// create an object of Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 1st integer: ");
        int number_1= input.nextInt();
        System.out.println("Your first input is: " + number_1);
		System.out.print("Enter 2nd  integer: ");
		int number_2= input.nextInt();
        System.out.println("Your second input is:" + number_2);

       
        Adder adder = new Adder();
        System.out.println("The sum of two numbers is: " + adder.add(number_1, number_2));
		 // closing the scanner object
        //input.close();
		System.out.println("WelDone, please enter your name");
		String name = input.next();
		System.out.println("You have entered:" + name);
    }
}
