package Patterns;
import java.util.Scanner;

public class Pattern_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n) {
			int j = 1;
			while(j<=n) {
				int k = 1;
				while(k<=n) {
					System.out.print("*");
					k++;
				}
				System.out.println();
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
