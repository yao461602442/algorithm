package HOJ;
import java.util.*;
public class 屌丝的逆袭 {

	/**
	 * @param args
	 */
	static int N;
	static int M;
	static int[][] meili;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		N=input.nextInt();
		M=input.nextInt();
		int r,c,maxValue, tmpValue;
		
		while(N!=0 && M!=0)
		{
			meili = new int[N][M];
			r = c = maxValue = tmpValue= Integer.MIN_VALUE;
			for(int i=0; i<N; ++i)
			{
				for(int j=0; j<M; ++j)
				{
					meili[i][j] = input.nextInt();
					//System.out.println(meili[i][j]);
				}
			}
			
			for(int i=0; i<meili.length; ++i)
			{
				for(int j=0; j<meili[i].length; ++j)
				{
					tmpValue= getValue(i, j);
					if(maxValue < tmpValue)
					{
						maxValue = tmpValue;
						r = i;
						c = j;
					}
				}
			}
			System.out.printf("%d %d %d%n", r+1, c+1, maxValue);
			N = input.nextInt();
			M = input.nextInt();
		}
	}
	
	
	public static int getValue(int row, int col)
	{
		boolean isMale = meili[row][col] < 0? false : true;
		int total = 0;
		
		if(row-1>=0)
		{
			if(isMale == isMale(row-1, col))//性别不同
				total += Math.abs(meili[row-1][col]);
			else //性别不同
				total -= Math.abs(meili[row-1][col]);
				
		}
			
		if(col-1>=0)
		{
			if(isMale == isMale(row, col-1))//性别相同
				total += Math.abs(meili[row][col-1]);
			else //性别不同
				total -= Math.abs(meili[row][col-1]);
		}
			
		if(row+1 < N)
		{
			if(isMale == isMale(row+1, col))//性别相同
				total += Math.abs(meili[row+1][col]);
			else //性别不同
				total -= Math.abs(meili[row+1][col]);
		}
		if(col+1 < M)
		{
			if(isMale == isMale(row, col+1))//性别相同
				total += Math.abs(meili[row][col+1]);
			else //性别不同
				total -= Math.abs(meili[row][col+1]);
		}
		return total;
	}
	
	public static boolean isMale(int row, int col)
	{
		return meili[row][col] < 0;
	}
	
}
