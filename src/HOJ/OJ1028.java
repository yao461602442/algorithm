package HOJ;
import java.util.*;
public class OJ1028 {
	
	
	static int[][] map = new int[121][121];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			int n=input.nextInt();
			System.out.println(f(n,n));
		}
	}
	
	public static int f(int n, int m)
	{
		if(map[n][m] != 0)
			return map[n][m];
		if(n==1 || m==1)
			return 1;
		else if(n<m)
			return f(n, n);
		else if(n==m)
		{
			int tmp = f(n, m-1) +1;
			map[n][m] = tmp;
			return tmp;
		}
		else 
		{
			int f1 = f(n, m-1);
			map[n][m-1] = f1;
			int f2 = f(n-m, m);
			map[n][m] = f1+f2;
			return map[n][m];
		}
	}
	
}
