import java.util.Scanner;

public class threeDiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
						
		Scanner input = new Scanner(System.in);				
				
		int number = 2; 
		
		threeDice threeDice = new threeDice(number);	 
		
		
		 System.out.printf("you rolled %d", threeDice.Throw());		 
		
			 
   }	 
}
