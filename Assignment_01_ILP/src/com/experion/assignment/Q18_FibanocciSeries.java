package com.experion.assignment;

import java.util.Scanner;

public class Q18_FibanocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		  Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the limit :");
	        int limit = scanner.nextInt();
	        
	        
	        int i = 1,  firstTerm = 0, secondTerm = 1;
	        System.out.println("Fibonacci Series of " + limit + " terms:");



	       while (i <=limit) {
	          System.out.print(firstTerm +" " );



	         int nextTerm = firstTerm + secondTerm;
	          firstTerm = secondTerm;
	          secondTerm = nextTerm;



	         i++;
	       }
		
	}

}
