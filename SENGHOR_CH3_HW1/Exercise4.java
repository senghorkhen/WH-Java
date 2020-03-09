import java.util.Scanner;
public class Exercise4 {
	public static void main(String[] args ) {
		@SuppressWarnings("resource")
		Scanner text = new Scanner(System.in); 
		 System.out.println("Enter your order:");
		 String letter = text.nextLine();
		switch(letter) {
		case "a":
		case "A":	
			System.out.println("You order BayChha."); 
			break;
		case "b":
		case "B":	
			System.out.println("You order Ice Tea."); 
			break;
		case "c":
		case "C":	
			System.out.println("You order Soup."); 
			break;
			default:
			System.out.println("Out of order..."); 
			break;
		}
	}
}