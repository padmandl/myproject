import java.util.Scanner;
public class FOREACHLOOP {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	 
	 
     String movienames[]=new String[5];
	for(int i=0;i<5;i++) {
		System.out.println("\n Enter the movie name"+(i+1));
		
		//String val = input.next();
		movienames[i]= input.next();
		
		}
	
	for(String movie:movienames) {
	System.out.println(""+movie);
	}
		
		//input.close();

}//end of class
}//end of main