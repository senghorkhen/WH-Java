
public class Exercise_a {
	public static void main(String[] args) {
		String[] employee = {"Doung", "Chan", "Minea", "Mesa", "Romdoul", "Veha", "Por", "Kanika"};
		int[] salary = {560, 560, 500,500, 190, 190, 560,700};
		int highest = 0;
		String person = " ";
		for(int i = 0; i < salary.length; i++) {
			if(salary[i] < salary[0]) {
				 highest = salary[i];
				person = employee[i];
			}
		}
		System.out.println("1. Employee who has highest salary:");
		int num = salary[0];
		for (int i = 0; i < salary.length; i++) {
			if(salary[i] > num) {
				num = salary[i];
			}
		}
		for (int i = 0; i < salary.length; i++) {
			if(salary[i] == num) {
				System.out.println(employee[i] + " has the highest salary of " + "$" + salary[i]);
			};
		}
		System.out.println("------------------------------------");
	}
}
