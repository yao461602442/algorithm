package OJ;
//最大K乘积问题
import java.util.*;
public class E1446 {

	private static int n; //整数的长度
	private static int k; //分割段数
	private static String snumber; //正整数
	private static int[][] M;//最佳结果
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		k = input.nextInt();
		snumber = input.next();
		M=new int[n+1][n+1];
		int i,j;
		for(i=1; i<=n; ++i)
			M[i][1] = conv(0, i);
		
		for(j=2; j<=k; ++j)
		{
			//划分为2~k段的过程
			for(i=j; i<=n; ++i)
			{
				//
				for(int t=j-1; t<i; ++t)
				{
					M[i][j] = Math.max(M[i][j], M[t][j-1]*conv(t, i-t));
				}
			}
		}
		System.out.println(M[n][k]);
		                                       
	}
	
	public static int conv(int start, int length)
	{
		String cut = snumber.substring(start, start+length);
		return Integer.parseInt(cut);
	}

}
