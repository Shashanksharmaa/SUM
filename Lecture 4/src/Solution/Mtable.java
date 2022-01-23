package Solution;

import java.util.Scanner;

public class Mtable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		int i = 1;
		
		while (i <= r) {
		  
		  System.out.println(i*n);
		  i++;
		}
	}
}