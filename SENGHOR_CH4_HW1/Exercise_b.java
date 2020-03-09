
public class Exercise_b {
	public static void main(String[] args) {
		String[] employee = {"Doung", "Chan", "Minea", "Mesa", "Romdoul", "Veha", "Por", "Kanika"};
		int[] salary = {560, 560, 500,500, 190, 190, 560,700};
		int lowest = 0;
		String person;
		for(int i = 0; i < salary.length; i++) {
			if(salary[i] < salary[0]) {
				lowest = salary[i];
				person = employee[i];
			}
		}
		System.out.println("2. Employee who has lowest salary:");
		int num = salary[0];
		for (int i = 0; i < salary.length; i++) {
			if(salary[i] < num) {
				num = salary[i];
			};
		}
		for (int i = 0; i < salary.length; i++) {
			if(salary[i] == num) {
			
				System.out.println(employee[i] + " has the lowest salary of " + "$" + salary[i]);
			};
		}
		System.out.println("--------------------------------------");
	}
}
