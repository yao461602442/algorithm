package OJ;
//石子合并问题

import java.util.*;

public class E1442 {
	private static int n; //石头个数
	private static int[] p; //存储石头
	private static int[][] M; //得分
	private static int[] sum; //石头总数
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		p = new int[n+1];
		M = new int[n+1][n+1];
		sum = new int[n+1];
		
		for(int i=1; i<=n; ++i)
		{
			p[i] = input.nextInt();
		}
		sum[0] = 0;
		for(int i=1; i<=n; ++i)
		{
			sum[i] = sum[i-1]+p[i];
		}
		for(int i=1; i<=n; i++)
		{
			M[i][i] = 0;
		}
		
		for(int r=2; r<=n; ++r)
		{
			for(int i=1; i<=n-r+1; ++i)
			{
				int j=i+r-1;
				M[i][j] = 0;
				for(int k=i; k<j; ++k)
				{
					M[i][j] = Math.max(M[i][j], M[i][k]+M[k+1][j]+sum[j]-sum[i-1]);
				}
			}
		}
		System.out.println(M[1][n]);
	}
	
	
	

}
