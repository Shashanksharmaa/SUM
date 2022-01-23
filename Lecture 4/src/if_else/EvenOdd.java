package if_else;

import java.util.Scanner; 

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int remainder= n % 2;
		if( remainder == 0){
			System.out.println("n is even number");
		}else {
			System.out.println("n is odd number");
		}

	}

}
