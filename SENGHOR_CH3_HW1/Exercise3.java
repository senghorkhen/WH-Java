
public class Exercise3 {
	
	public static void main(String[] args ) {
		int i = 1;
		int sum = 0;
		int average = 0;
		int count = 0;
		do {
			if(i % 2 != 0) {
				count ++;
				sum += i;
			}
			i ++;	
		}while (i <= 50);
		average = sum / count  ;
		System.out.println("The average of odd number: " + average);
	}
	
}