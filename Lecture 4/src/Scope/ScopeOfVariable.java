package Scope;

public class ScopeOfVariable {
	
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		
		//i = 12; Error duplicate local variable
		if(i==10) {
			//int i =232; Error because if we want to print then compiler can't decide which i ?
			//Can't put same variable of assignment
			int n = 23;
			//n is valid inside the loop only
		    System.out.println(n);
		}
		//System.out.println(n); This can't be available outside the loop this is called scope
//		int n = 234; // This will be global variable does not depend on loop
//		System.out.println(n);
//		else {
//			int n = 234;
//		}
		//System.out.println(n); Error
		int n = 12;
		System.out.println(n);
		
		i = 1;
		while (i <= n) {
			int j = 1;
		    while(j <= i) {
		    	System.out.print(j);
		    	j = j + 1;
		    }
		    System.out.println();
		    i = i + 1;
		}
		
		
	}

}
