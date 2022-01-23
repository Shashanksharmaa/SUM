package Patterns;
import java.util.Scanner;
public class SquarePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		
		while(i <= n) {
			int j = 1;
			while (j <= n) {
				
				System.out.print("*"); //Don't use println because it will have only one star
				j++;
			}
			System.out.println();//To go to the next line after printing desired line
			 i++;
		}

	}

}
