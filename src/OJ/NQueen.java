package OJ;

import java.util.*;

public class NQueen {

	/**
	 * 数据结构
	 * 
	 */
	static int[] x;//摆放位置
	static int n; //皇后个数
	
	static boolean find = false;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		x = new int[n+1];
		backtrack(1);

	}
	
	public static void backtrack(int t)
	{
		if(find)
			return ;
		if(t>n)
		{
			find = true;
			for(int i=1; i<=n; ++i)
				System.out.printf("%d ", x[i]);
			System.out.printf("%n");
		}
		else{
			for(int i=1; i<=n; ++i)
			{
				x[t] = i;
				if(place(t))
				{
					backtrack(t+1);
				}
			}
		}
		
	}
	
	public static boolean place(int k)
	{
		for(int i=1; i<k; ++i)
		{
			if(x[i]== x[k] || Math.abs(i-k) == Math.abs(x[i]-x[k]))
				return false;
		}
		return true;
	}

}
