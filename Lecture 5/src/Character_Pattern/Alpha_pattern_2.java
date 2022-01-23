package Character_Pattern;

import java.util.Scanner;

public class Alpha_pattern_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i <= n) {
			int j = 1;
			char starting_character =(char) ('A'+i-1);
			while(j <= i ) {
				System.out.print((char)(starting_character));//'A' + j  will be a number so should be type cast into character;
				starting_character--;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
