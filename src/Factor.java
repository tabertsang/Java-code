package ch6;

import java.util.Scanner;

public class Factor {
	public static boolean isPrime(int i)
	{
		boolean isPrime = true;
		for (int k=2; k<i; k++)
		{
			if (i%k == 0)
			{
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	public static void getFactor(int a, boolean isFirst)
	{
		if (isPrime(a))
		{
			if (!isFirst)
			{
				System.out.print("x");
			}
			System.out.print(a);
		}
		else
		{
			int i;
			for (i=2; i<a; i++)
			{
				if (isPrime(i) && a%i==0)
				{
					break;
				}
			}
			
			if (!isFirst)
			{
				System.out.print("x");
			}
			System.out.print(i);
			getFactor(a/i,false);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		System.out.print(num+"=");
		getFactor(num,true);	
	}
}
