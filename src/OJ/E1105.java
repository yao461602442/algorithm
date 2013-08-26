package OJ;
//01±³°ü
import java.util.*;
public class E1105 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		int[] weight = new int[length];
		int[] value = new int[length];
		int c;
		int[][] table;
		for(int i=0; i<weight.length; ++i)
		{
			weight[i] = input.nextInt();
			value[i] = input.nextInt();
		}
		c = input.nextInt();
		
		table = new int[length][c+1];
		
		int iMin = Math.min(weight[length-1]-1, c);
		
		for(int i=0; i<iMin; ++i)
			table[length-1][i] = 0;
		for(int i=iMin; i<=c; ++i)
			table[length-1][i] = value[length-1];
		
		for(int i=length-2; i>0; --i)
		{
			iMin = Math.min(weight[i], c);
			for(int j=0; j<iMin; ++j)
				table[i][j] = table[i+1][j];
			for(int j=iMin; j<=c; ++j)
				table[i][j] = Math.max(table[i+1][j], table[i][j-weight[i]]+value[i]);
		}
		
		table[0][c] = table[1][c];
		if(table[0][c] > table[1][c-weight[0]]+value[0])
			table[0][c] = table[1][c-weight[0]]+value[0];
		System.out.println(table[0][c]);
		
	}
}
