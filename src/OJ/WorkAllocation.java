package OJ;
import java.util.*;
public class WorkAllocation {

	/**
	 * 数据结构
	 */
	static int n; //几个人
	static int[][] a; //花费数组
	static int[] x; //安排数组
	static int minCost = Integer.MAX_VALUE;
	static int curCost = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		a = new int[n+1][n+1];
		x = new int[n+1];
		for(int i=1; i<=n;++i)
		{
			for(int j=1; j<=n; ++j)
			{
				a[i][j] = input.nextInt();
			}
		}
		backtrack(1);
		System.out.printf("%d", minCost);
	}
	
	public static void backtrack(int t)
	{
		if(t>n)
		{
			if(curCost < minCost)
				minCost = curCost;
		}
		else
		{
			for(int i=1; i<=n; ++i)
			{
				x[t] = i;
				if(allocation(t) && curCost+a[t][i] < minCost) // constraint&& bound
				{
					curCost+=a[t][i];
					backtrack(t+1);
					curCost-=a[t][i];
				}
			}
		}
	}
	
	public static boolean allocation(int k)
	{
		for(int i=1; i<k; ++i)
		{
			if(x[i]==x[k])
				return false;
		}
		return true;
	}
	
}
