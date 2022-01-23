package Patterns;

import java.util.Scanner;

public class Pattern_1_22_333_4444 {


		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int i = 1;
			int counter = i;
			while(i <= n) {
				int j = 1;
				while (j <= i) {
					
					System.out.print(i); 
					counter++;
					j++;
				}
				System.out.println();
				 i++;
			}
			
		}

	}


