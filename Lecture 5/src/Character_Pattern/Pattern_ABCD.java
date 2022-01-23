package Character_Pattern;
import java.util.Scanner;
public class Pattern_ABCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= n ) {
				System.out.print((char)('A'+j-1));//'A' + j  will be a number so should be type cast into character;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
