package Question1;

import java.util.*;


interface AdvancedArithmetic {
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{
	
	int divisorSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if (n%i==0)
				sum+=i;
		}
		return sum;
	}

	@Override
	public int divisor_sum(int n) {
		// TODO Auto-generated method stub
		int sum = divisorSum(n);
		return sum;
	}
		
}

public class question1 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int n=sc.nextInt();
			MyCalculator mc= new MyCalculator();
			System.out.print(mc.divisor_sum(n));

		}

	}


