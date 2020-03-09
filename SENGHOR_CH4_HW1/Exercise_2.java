
import java.util.Arrays;
public class Exercise_2 {
	public static void main(String[] args) {
		int[] numRandom = new int[15];
		int counter = 0;
		String index = " ";
		for(int i = 0 ;i < numRandom.length; i++) {
			int random = (int)(Math.random()*10 + 0);
			numRandom[i] = random;
			System.out.print(numRandom[i]+" ");
			if(numRandom[i] == 5) {
				counter++;
				index = index + i +" ";
			}	
		}
		System.out.println();
		if(counter != 0) {
			System.out.println("There aer " + counter +" number 5 found in index as bellow: ");
			System.out.println("Index: " + index);
		}else {
			System.out.println("Number 5 not found.");
		}
	}	
}
