package if_else;
import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
//		if(a>=b && a>=c) {
//			System.out.println("a is the largest");
//		}else {
//			if(b >= c && b>= a) {
//				System.out.println("b is the largest");
//			}else {
//				System.out.println("c is the largest");
//				}
//		}
		if(a >= b && a >=c) {
			System.out.println("a is the largest");
		}else if(b >= c && b >= a) {
			System.out.println("b is the largest");
		}else {
			System.out.println("c is the largest");
		}
    }

}
