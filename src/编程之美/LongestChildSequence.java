package 编程之美;

import java.util.*;

public class LongestChildSequence {
	
	
	static int[] MinV;
	static int n; //序列长度
	static int[] array; //序列
	static int[] LIS;//递增序列长度
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		8
//		1 -1 2 -3 4 -5 6 -7
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		array = new int[n];
		MinV = new int[n+1];
		LIS = new int[n];
		int min = Integer.MAX_VALUE;
		for(int i=0; i<n; ++i)
		{
			array[i] = input.nextInt();
			if(array[i] < min)
				min = array[i];
		}
		MinV[1] = array[0];
		MinV[0] = min-1;
		for(int i=0; i<n; ++i)
		{
			LIS[i] = 1;
		}
		int maxLen = 1; 
		for(int i=1; i<n; ++i)
		{
			int j;
			for(j=maxLen; j>=0; --j)
			{
				if(array[i] > MinV[j])
				{
					LIS[i] = j + 1;
					break;
				}
			}
			if(LIS[i] > maxLen)
			{
				maxLen = LIS[i];
				MinV[LIS[i]] = array[i];
			}
			else if(array[i] > MinV[j] && array[i] < MinV[j+1])
			{
				MinV[j+1] = array[i];
			}
		}
		for(int i=0; i<n; ++i)
			System.out.printf("%d ", LIS[i]);
		System.out.println();
		for(int i=0; i<n; ++i)
			System.out.printf("%d ", MinV[i]);
		System.out.println(maxLen);
	}

}
