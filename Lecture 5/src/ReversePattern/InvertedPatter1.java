package ReversePattern;
import java.util.Scanner;
public class InvertedPatter1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i <= n ) {
			int j = n - i + 1;
			int num = j;
			while(j > 0) {
				System.out.print(num);
				j--;
			}
			System.out.println();
			i++;
		}
	}
}