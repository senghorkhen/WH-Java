
public class Exercise_d {
	public static void main(String[] args) {
		String[] employee = {"Doung", "Chan", "Minea", "Mesa", "Romdoul", "Veha", "Por", "Kanika"};
		int[] salary = {560, 560, 500,500, 190,190, 560,700};
		
		int result = 0;
		int average = 0;
		int count = 0;
		for (int i = 0; i < salary.length; i++) {
			result += salary[i];
			count++;
		}
		average = result/count;
		System.out.println("4.Employee who has higher salary than average: "+ average + ".0");
		for(int j = 0; j < salary.length; j++) {
			if(average < salary[j] ) {
				System.out.println(employee[j] + ":" + salary[j] + "$");
			};
		}
		System.out.println("--------------------------------------");
		
	}
}
