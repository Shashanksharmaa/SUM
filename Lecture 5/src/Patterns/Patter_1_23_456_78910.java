package Patterns;

import java.util.Scanner;

public class Patter_1_23_456_78910 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int i = 1;
		    int counter = i;
			while (i <= n) {
				int j = 1;
				
				while (j <= i) {
					System.out.print(counter);
					
					counter++;
					
					j++;

				}
				System.out.println();
				i++;
				
			}

		}

	}


