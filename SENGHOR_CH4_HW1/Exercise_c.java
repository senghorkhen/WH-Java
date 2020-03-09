
public class Exercise_c {
	public static void main(String[] args) {
		String[] employee = {"Doung", "Chan", "Minea", "Mesa", "Romdoul", "Veha", "Por", "Kanika"};
		int[] salary = {560, 560, 500,500, 190,190, 560,700};
		int result = 0;
		int average = 0;
		int count = 0;
		for (int i = 0; i <salary.length; i++) {
			result += salary[i];
			count++;
		}
		average = result/count;
		System.out.println("3.Employee who has lower salary than average:" + average + ".0");
		for (int j = 0; j < salary.length; j++) {
			if(salary[j] < average) {
				System.out.println(employee[j] + ":" + salary[j] + "$");
			};
		}
		System.out.println("--------------------------------------------");
	}
}
