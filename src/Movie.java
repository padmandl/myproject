import java.util.Scanner;
public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner input = new Scanner(System.in);
	

//switch (number) {
//case 1:
//System.out.println("Movie name is Harry Potter and the Philosopher's Stone");
//break;
//case 2:
//System.out.println("Movie name is Harry Potter and the Chamber of Secrets");
//break;
//case 3:
//System.out.println(" Movie name is Harry Potter and the Prisoner of Azkaban");
//break;
//case 4:
//System.out.println("Movie name is Harry Potter and the Goblet of Fire");
//break;
//case 5:
//System.out.println("Movie name is Harry Potter and the Order of the Phoenix");
//break;
//case 6:
//System.out.println("Movie name is Harry Potter and the Half-Blood Prince");
//break;
//case 7:
//System.out.println("Movie name is Harry Potter and the Deathly Hallows – Part 1");
//break;
//case 8:
//System.out.println("Movie name is Harry Potter and the Deathly Hallows – Part 2");
//break;
//default:
//System.out.println("not valid number");	
//
//} // End of Switch

     // if(number<=8) {
	
	//	System.out.println("Movie name is "+ moviename[number]);
		
//}//end of for loop
		int movienumber[]= {1,2,3,4,5,6,7,8};
		int movieyear[]= {2001,2002,2004,2005,2007,2009,2010,2011};
		String moviename[]= {"Harry Potter and the Philosopher's Stone","Harry Potter and the Chamber of Secrets"," Harry Potter and the Prisoner of Azkaban",
				              "Harry Potter and the Goblet of Fire","Harry Potter and the Order of the Phoenix","Harry Potter and the Half-Blood Prince",
				              "Harry Potter and the Deathly Hallows – Part 1","Harry Potter and the Deathly Hallows – Part 2"};
	
		
		int i;
		for(i=0;i<movienumber.length;i++) {
			System.out.println("movie number: "+ movienumber[i]);
			System.out.println("movie name: "+moviename[i]);               //for loop to print all data
			System.out.println("year of release: "+movieyear[i]);
			System.out.println("\n");
		}
		
		for(int num:movienumber) {
			System.out.println(""+num);
			System.out.println(""+moviename[num-1]);                        //for each loop to print all data
			System.out.println(""+movieyear[num-1]);
		}
		
		
			//int x=movieyear.length;
			//int y=x-1;
			//int x1=movieyear[0];

//			int y1=movieyear[y]-x1;
		
							
	//	System.out.println(""+movieyear[y]);
	 //   System.out.println(""+x1);
		//System.out.println("no of years lapsed between first and last movies are"+y1);
		
		//System.out.println(+movienumber.length);
		
		
		System.out.println("\n Enter the number from (1-8) to know the movie name : ");
		int number = input.nextInt();
		input.close();
		
		if(number== 1) {
			System.out.println("first movie name :Harry Potter and the Philosopher's Stone");
		}
		else if(number==8) {
			System.out.println("last movie name: Harry Potter and the Deathly Hallows – Part 2");  //for first and last movie
		}
		else
		{
			System.out.println("not first or last movie");
		}
		
		System.out.println("\nMovie name is "+ moviename[number-1]);                                              //name of movie with number input
		
		
		
		System.out.println("\nno of years lapsed is "+(movieyear[movieyear.length - 1]-movieyear[0]) );              //no of movies lapsed between first and last movie
		
//		System.out.println("Average is "+((movieyear[movieyear.length - 1]-movieyear[0])/movienumber.length) );
//		System.out.println("Average in remainder is "+((movieyear[movieyear.length - 1]-movieyear[0])%movienumber.length) );
		
		int year=((movieyear[movieyear.length - 1]-movieyear[0])/movienumber.length); 
		int month=((movieyear[movieyear.length - 1]-movieyear[0])%movienumber.length);
		System.out.println("\naverage number of years for movie release is "+year+" years and "+month+" months" );      //average no of years for movie release
	
//		int i = 0;
//		for(String name : moviename) {
//			
//			System.out.println("\n movie name of number "+movienumber[i]+" is  "+name);
//			i++;
//			
//		}//end of for loop
//		
		
		
		
		

	}//end of main method

}//end of class
