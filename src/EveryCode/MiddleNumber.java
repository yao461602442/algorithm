package EveryCode;
import java.util.*;
public class MiddleNumber {
	static int n;
	static int[] x;
	static int[] y;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		x = new int[n];
		y = new int[n];
		for(int i=0; i<n; ++i)
			x[i] = input.nextInt();
		for(int i=0; i<n; ++i)
			y[i] = input.nextInt();
		
		getMiddle(x, 0, n-1, y, 0, n-1);
		
		
	}
	
	public static void getMiddle(int[] a, int p1, int q1, int[] b, int p2, int q2)
	{
		int alen = q1-p1+1;
		int blen = q2-p2+1;
		int amid = a[p1+alen/2];
		int bmid = b[p2+blen/2];
		
		if(amid==bmid)
		{
			System.out.println(amid+" "+bmid);
		}
		else if(alen+blen<=4)
		{
			int[] c = merge(a, p1, q1, b ,p2, q2);
			Arrays.sort(c);
			System.out.println(c[c.length/2-1] + " " + c[c.length/2]);
		}
		else if(amid < bmid)
		{
			if(alen%2==0)
				getMiddle(a, p1+alen/2-1, q1, b, p2, p2+blen/2);
			else
				getMiddle(a, p1+alen/2, q1, b, p2, p2+blen/2);
		}
		else
		{
			if(blen%2==0)
				getMiddle(a,p1, p1+alen/2, b, p2+blen/2-1, q2);
			else
				getMiddle(a, p1, p1+alen/2, b, p2+blen/2, q2);
		}
		
		
	}
	
	public static int[] merge(int[] m, int p1, int q1, int[] n, int p2, int q2)
	{
		int alen = q1-p1+1;
		int blen = q2-p2+1;
		int[] c = new int[alen+blen];
		int i=p1;
		int j=p2;
		int k=0;
		while(i<=q1 && j<=q2)
		{
			if(m[i] < n[j])
				c[k++] = m[i++];
			else
				c[k++] = n[j++];
		}
		while(i<=q1)
			c[k++] = m[i++];
		while(j<=q2)
			c[k++] = n[j++];
		return c;
	}

}
