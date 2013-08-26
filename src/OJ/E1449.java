package OJ;
//采药问题
import java.util.*;
public class E1449 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); //物品个数
		int c = input.nextInt(); //背包容量
		int[] time = new int[n]; // 重量
		int[] value = new int[n]; //
		int[][] table = new int[n][c+1]; //填表
		for(int i=0; i<n; ++i)
		{
			value[i] = input.nextInt();
			
		}
		for(int i=0; i<n; ++i)
		{
			time[i] = input.nextInt();
			
		}
		
		int jMax = Math.min(time[n-1], c);
		for(int i=0; i<jMax; ++i)
			table[n-1][i] = 0;
		for(int i=jMax; i<=c; ++i)
			table[n-1][i] = value[n-1];
		
		for(int i=n-2; i>0; --i)
		{
			jMax = Math.min(time[i], c);
			for(int j=0; j<jMax; ++j)
				table[i][j] = table[i+1][j];
			for(int j=jMax; j<=c; ++j)
				table[i][j] = Math.max(table[i+1][j], table[i+1][j-time[i]] + value[i]);
		}
		
		table[0][c] = table[1][c];
		if(c >= time[0])
			table[0][c] = Math.max(table[0][c], table[1][c-time[0]] + value[0]);
		
		System.out.println(table[0][c]);
	}
	
	
}
