package day1.session1;

public class Fibonacci {
	public static void main(String[] args) {
		int m = 0;
		int n = 1;
		int count = 11;
		int sum=0;
		System.out.println(m);
		System.out.println(n);
		for(int i=1;i<=count;i++)
		{
			sum=m+n;
			System.out.println(sum);
			m=n;
			n=sum;
			
		}
	}
	

}
