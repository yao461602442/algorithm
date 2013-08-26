package EveryCode;

import java.util.Scanner;

public class NQueue {
	
	static int n;
	static int[] M; //
	static int[][] map;
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println(" ‰»Î∆Â≈Ã¥Û–°");
		n = input.nextInt();
		M = new int[n+1];
		map = new int[n+1][n+1];
		backtrack(1);
		
		
	}
	public static void backtrack(int t)
	{
		if(t==n+1)
		{
			for(int i=1; i<=n; ++i)
			{
				System.out.print(M[i]+" ");
			}
			System.out.println();
		}
		else
		{
			for(int i=1; i<=n; ++i)
			{
				M[t]=i;
				if(contraint(t))
				{
					backtrack(t+1);
				}
			}
		}
	}
	
	public static boolean contraint(int t)
	{
		for(int i=1; i<t; ++i)
		{
			if(M[i] == M[t] || Math.abs(i-t) == Math.abs(M[i]-M[t]))
			{
				return false;
			}
		}
		return true;
	}
	
	

}
