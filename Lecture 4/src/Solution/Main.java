package Solution;
import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double basic_salary = s.nextInt();
		char grade = s.next().charAt(0);
		Character.toUpperCase(grade);
		double hra = 0.20 * basic_salary;
		double da = 0.50 * basic_salary;
		double pf = 0.11 * basic_salary;
		int allow=0;
		if(grade == 'A') {
			
			allow = 1700;
		}else if(grade == 'B') {
			
			allow = 1500;
			
		}else if(grade >= 'C' && grade <= 'Z') {
			allow = 1300;
		}
		double total_salary = basic_salary + hra + da + allow - pf;
	
		System.out.println(Math.round(total_salary));
	}



}
