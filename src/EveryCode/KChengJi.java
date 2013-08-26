package EveryCode;
import java.util.*;
public class KChengJi {

	private static int n; //整数的长度
	private static int m; //整数分割的段数
	private static String number; //该整数
	private static int M[][] ;//M[i][j] 表示从0~i的最佳j乘积
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		m = input.nextInt();
		number = input.next();
		M = new int[n+1][n+1];
		
		int i,j,k;
		for(i=1; i<=n; ++i)
			M[i][1] = conv(0, i);
		for(j=2; j<=m; ++j)
		{
			for(i=j; i<=n; ++i)
			{
				for(k=j-1;k<i;++k)
				{
					M[i][j] = Math.max(M[i][j], M[k][j-1]*conv(k, i-k));
				}
			}
		}
		System.out.println(M[n][m]);
	}
	
	public static int conv(int start, int length)
	{
		return Integer.parseInt(number.substring(start, start+length));
	}

}
