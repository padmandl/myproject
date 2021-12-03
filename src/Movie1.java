import java.util.Scanner;

public class Movie1 {

	public static void main(String[] args) {
		
		int movienumber[]= {1,2,3,4,5,6,7,8};
		int movieyear[]= {2001,2002,2004,2005,2007,2009,2010,2011};
		String moviename[]= {"Harry Potter and the Philosopher's Stone","Harry Potter and the Chamber of Secrets"," Harry Potter and the Prisoner of Azkaban",
				              "Harry Potter and the Goblet of Fire","Harry Potter and the Order of the Phoenix","Harry Potter and the Half-Blood Prince",
				              "Harry Potter and the Deathly Hallows – Part 1","Harry Potter and the Deathly Hallows – Part 2"};
	
		
		Scanner input = new Scanner(System.in);
            
		for (int i=0; i<=8;) {

			System.out.println("\n Enter the number from (1-8) to know the movie name : ");//[AVERAGE] Keep getting input from user and print the name
			                                                                                //   of the movie till the user enters an invalid input.
			int number= input.nextInt();
			i=number;
			
		if(number>=1 && number<=8) {

			System.out.println("\nMovie name is "+ moviename[number-1]);
		}
		else {
				
			System.out.println("not valid input");
		
			
		}
		}
		input.close();
		
		
		//do while
		
//		int i = 0;
//
//		do {
//			System.out.println("\n Enter the number from (1-8) to know the movie name : ");
//			int number = input.nextInt();
//			i = number;
//		if (number >= 1 && number <8) {
//			
//			System.out.println("\nMovie name is "+ moviename[number]);
//			
//		} else {
//			System.out.println("not valid input");
//			
//		}
//		
//		
//		} while(i < 8); 
			
		//input.close();
		
			
	}//end of main

}//end of class movie1
