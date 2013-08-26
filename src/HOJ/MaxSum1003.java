package HOJ;
import java.util.Scanner;

public class MaxSum1003
{
	static int T,n;
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		T = input.nextInt();
		int[] array;
		for(int i=0; i<T; ++i)
		{
			int n=input.nextInt();
			array = new int[n];
			for(int j=0;j<n; ++j)
			{
				array[j] = input.nextInt();
			}
			maxSum(array, i+1);
			if(i<T-1)
				System.out.println();
		}
	}
	
	public static void maxSum(int[] A, int which)
	{
		int n = A.length;
		int nStart = A[n-1];
		int nAll = A[n-1];
		int begin = n-1;
		int end = n-1;
		int tmpEnd=n-1;
		for(int i=n-2; i>=0; --i)
		{
			if(nStart<0)
			{
				nStart = 0;
				tmpEnd = i;
			}
			nStart+=A[i];
			if(nAll <= nStart)
			{
				nAll = nStart;
				begin = i;
				end = tmpEnd;
			}
		}
		System.out.printf("Case %d:%n%d %d %d%n", which, nAll, begin+1, end+1);
	}
}


























//类似动态规划的方法，太慢了！
//
//public class MaxSum1003 {
//
//	static int T;
//	static int[] lens;
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		T = input.nextInt();
//		int n;
//		int[][] conditions = new int[T][100000];
//		lens = new int[T];
//		for(int i=0; i<T; ++i)
//		{
//			lens[i] = input.nextInt();
//			for(int j=0; j<lens[i]; ++j)
//				conditions[i][j] = input.nextInt();
//		}
//		
//		for(int i=0; i<T; ++i)
//		{
//			maxSum(conditions[i], lens[i], i+1);
//			System.out.println();
//		}
//		
//	}
//	
//
//	public static void maxSum(int[] con, int len, int whichCase)
//	{
//		int n = len;
//		int[] map = new int[n];
//		for(int i=0;i<n;++i)
//			map[i] = con[i];
//		int max = Integer.MIN_VALUE;
//		int start = 0;
//		int end = 0;
//		for(int r=1; r<n; ++r)
//		{
//			for(int i=0; i<n-r; ++i)
//			{
//				int j=i+r;
//				map[i] = map[i] + con[j];
//				if(max <= map[i])
//				{
//					max = map[i];
//					start = i;
//					end = j;
//				}
//			}
//		}
//		
//		System.out.printf("Case %d:%n", whichCase);
//		System.out.printf("%d %d %d%n", max, start+1, end+1);
//	}
//	
//	
//}
