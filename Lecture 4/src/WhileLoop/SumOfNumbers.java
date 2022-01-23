package WhileLoop;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1; //That is next number to be added as we have discussed in flowchart
		int sum = 0;
		while(i <= n) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println(sum);

	}

}
