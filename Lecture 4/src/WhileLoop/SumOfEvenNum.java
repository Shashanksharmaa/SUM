package WhileLoop;
import java.util.Scanner;

public class SumOfEvenNum {

	public static void main(String[] args) {
		Scanner s = new  Scanner(System.in);
		int even = s.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(i <= even)
		{
			if(i % 2 == 0) 
			{
				sum = sum + i;
			}
			i = i + 1;
		}
		System.out.println(sum);

	}

}
