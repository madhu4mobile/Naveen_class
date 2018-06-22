package Day2;

import java.util.Scanner;

/*
 * Print Fibonacci Series
To print Fibonacci series in Java Programming,
you have to first print the starting two of the Fibonacci series
 and make a while loop to start printing the next number of the Fibonacci series.
  Use the three variables say a, b and c.
  Place b in c and c in a, and now place a+b in c to print the value of c
   to make the Fibonacci series as shown in the following program.
 * */
public class Ex3_Fibonacci_IncrementDecrement {

	public static void main(String[] args) {
		int a = 1; int b = 1; int c = 0;

	    Scanner in = new Scanner(System.in);
	    System.out.println("How many Fibonocci numbers you want to see ? ");
	    int limit = in.nextInt(); //set the range of the series as user input.
		//int limit = 10; 
		//System.out.println(limit);
	    int count = 1;
		while ( limit > 0) { // initiate a condition till i is less than the limit
			//System.out.println(limit);
			a = b;  // A takes the value of b
			b = c;  // b takes the value of c
			c = a+b; // c adds the values of a and b and stores in c. 
			System.out.println(count +" Fibonocci number is : "+c);
			count++;
			limit--;
		}
		//System.out.println(limit);
	}

}
