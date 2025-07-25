package week1.day2;

public class IsPrimeNumber {
	public static void main(String[] args) {
		int n=10;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("is not prime number");
				return;
			}			
		}
		System.out.println("is a prime number");

	}


}
