package Patterns;
import java.util.Scanner;

public class Pattern_1_21_321_4321 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		int counter;
		
		while(i <= n) {
			counter = i;
			int j = 0;
			while (j < i) {
				
				System.out.print(counter); 
				counter--;
				j++;
			}
			System.out.println();
			 i++;
		}
		


	}

}
