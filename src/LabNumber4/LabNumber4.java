package LabNumber4;

import java.util.Scanner;
import java.util.Formatter;

public class LabNumber4 {

	public static void main(String[] args) {
		// Pair a program and display a table of powers.
		// Prompt the user to enter an integer
		// Display a table of squares and cubes from 1, to the value entered
				
	    Scanner scnr = new Scanner (System.in);
        String userContinue = "yes";

            
        do {
            System.out.println("Please enter a number");
            int number = scnr.nextInt();
            Formatter fmt;
            
            System.out.println("  Num    Sq    Cube");
            System.out.println("======  ====  =====");
                        
             for(int i = 1; i <= number; ++i){
             fmt = new Formatter();
             
          fmt.format("%4d %5d %6d", i, i * i, i*i*i);
          System.out.println(fmt);
                
        }
             System.out.println("Would you like to continue?");
            userContinue = scnr.next();
        }while(userContinue.equals("yes"));

        System.out.println("Goodbye!");
        
        scnr.close();
	}
	
}

