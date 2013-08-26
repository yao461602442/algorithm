package OJ;
//采药问题
import java.util.*;
public class E1445 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int T = input.nextInt(); //可用的总时间
		int M = input.nextInt(); //草药个数
		int[] time = new int[M]; //采草药要花的时间
		int[] value = new int[M]; //采草药获得的价值
		int[][] table = new int[M][T+1]; //填表
		for(int i=0; i<M; ++i)
		{
			time[i] = input.nextInt();
			value[i] = input.nextInt();
		}
		
		int jMax = Math.min(time[M-1], T);
		for(int i=0; i<jMax; ++i)
			table[M-1][i] = 0;
		for(int i=jMax; i<=T; ++i)
			table[M-1][i] = value[M-1];
		
		for(int i=M-2; i>0; --i)
		{
			jMax = Math.min(time[i], T);
			for(int j=0; j<jMax; ++j)
				table[i][j] = table[i+1][j];
			for(int j=jMax; j<=T; ++j)
				table[i][j] = Math.max(table[i+1][j], table[i+1][j-time[i]] + value[i]);
		}
		
		table[0][T] = table[1][T];
		if(T >= time[0])
			table[0][T] = Math.max(table[0][T], table[1][T-time[0]] + value[0]);
		
		System.out.println(table[0][T]);
	}
	
	
}
