package Solution;
import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int SumEven = 0;
		int SumOdd = 0;
		
	    while(n!=0) {
	    	int c = n%10;
	    	if(c%2==0) {
	    		SumEven = SumEven + c;
	    	}
	    	if(c%2!=0) {
	    		SumOdd = SumOdd + c;
	    	}
	    	n = (int)(n/10);
	    	
	    }
	    System.out.println(SumEven+ " " +SumOdd);
	}

}
