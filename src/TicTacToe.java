package ch4;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		boolean getResult = false;
		int numOfX = 0;
		int numOfO = 0;
		
		
		n = in.nextInt();
		int[][] board = new int[n][n];
		
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<n; j++)
			{
				board[i][j] = in.nextInt();
			}
		}
		
		for (int i=0; i<n; i++)
		{
			numOfX = 0;
			numOfO = 0;
			for(int j=0; j<n; j++)
			{
				if (board[i][j] == 1)
				{
					numOfX++;
				}
				else
				{
					numOfO++;
				}
			}
			if (numOfX==n || numOfO==n)
			{
				getResult = true;
				break;
			}
		}
		
		if (!getResult)
		{
			for (int i=0; i<n; i++)
			{
				numOfX = 0;
				numOfO = 0;
				for (int j=0; j<n; j++)
				{
					if (board[j][i]==1)
					{
						numOfX++;
					}
					else
					{
						numOfO++;
					}
				}
				if (numOfX==n || numOfO==n)
				{
					getResult = true;
					break;
				}
			}
		}
		
		if(!getResult)
		{
			numOfX = 0;
			numOfO = 0;
			for (int i=0; i<n; i++)
			{
				if (board[i][i]==1)
				{
					numOfX++;
				}
				else
				{
					numOfO++;
				}
			}
			if (numOfX==n || numOfO==n)
			{
				getResult = true;
			}
		}
		
		if(!getResult)
		{
			numOfX = 0;
			numOfO = 0;
			for (int i=0; i<n; i++)
			{
				if (board[i][n-i-1]==1)
				{
					numOfX++;
				}
				else
				{
					numOfO++;
				}
			}
			if (numOfX==n || numOfO==n)
			{
				getResult = true;
			}
		}
		
		if (getResult)
		{
			if (numOfX == n)
			{
				System.out.println("X");
			}
			else
			{
				System.out.println("O");
			}
		}
		else
		{
			System.out.println("NIL");
		}
	}

}