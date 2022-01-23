package Solution;
import java.util.Scanner;
public class PowerOfNUM {
      public static void main(String [] args)
       {
          Scanner s=new Scanner(System.in);
          int n=s.nextInt();
          int x=s.nextInt();
          int p=1;
          int i = 1;
          while( i <= x) {
        	  p = p * n;
        	  i++;
          }
          System.out.println(p);
       }
}
