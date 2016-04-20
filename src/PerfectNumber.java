package ch6;

import java.util.Scanner;

public class PerfectNumber {
	public static boolean isPerfectNumber(int num)
	{
		boolean isPerfect = false;
		int sum =0;
		for (int i=1; i<num; i++)
		{
			if (num%i ==0)
			{
				sum += i;
			}
		}
		
		if (num == sum)
		{
			isPerfect = true;
		}
		
		return isPerfect;
	}
	
	public static void main(String[] args) {
		int n;
		int m;
		int cnt=0;
		boolean isFirst =true;
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		for(int i=n; i<=m; i++)
		{
			if (isPerfectNumber(i))
			{
				if (!isFirst)
				{
					System.out.print(" ");
				}
				System.out.print(i);
				isFirst = false;
				cnt++;
			}
		}
		
		if (cnt==0)
		{
			System.out.println("NIL");
		}
	}
}
