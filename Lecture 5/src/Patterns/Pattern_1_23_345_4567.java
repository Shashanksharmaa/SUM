package Patterns;

import java.util.Scanner;

public class Pattern_1_23_345_4567 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int i = 1;
			while (i <= n) {
				int j = 1;
				int start_number = i;
				while (j <= i) {
					System.out.print(start_number);
					
					start_number++;
					
					j++;

				}
				System.out.println();
				i++;
				
			}

		}


	}


