package day1.session1;

public class Prime {
	public static void main(String[] args) {
		int num=23;
		int count=0;
		for(int i=2;i<num;i+=1)
		{
			if(num%i==0)
				count=count+1;
		}
		if(count!=0)
		{
			System.out.println("prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
		}
	}
		