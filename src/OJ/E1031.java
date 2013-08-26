package OJ;
import java.util.*;
public class E1031 {

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
		{
			x[i] = input.nextInt();
		}
		
		for(int i=0; i<n; ++i)
		{
			y[i] = input.nextInt();
		}
		
		findMiddle(x, 0, n-1, y, 0, n-1);
		
	}
	
	public static void findMiddle(int[] a, int p1, int q1, int[] b, int p2, int q2)
	{
		int alen = q1-p1+1;
		int blen = q2-p2+1;
		int mida = a[p1+alen/2];
		int midb = b[p2+blen/2];
		
		if(mida == midb)
		{
			System.out.printf("%d %d", mida, midb);
		}
		else if(alen + blen <= 4)
		{
			int[] tmp = merge(a, p1, q1, b, p2, q2);
			System.out.printf("%d %d", tmp[tmp.length/2-1], tmp[tmp.length/2]);
		}
		else if(mida < midb)
		{
			if(alen%2==0)
				findMiddle(a, p1+alen/2-1, q1, b, p2, p2+blen/2);
			else
				findMiddle(a, p1+alen/2, q1, b, p2, p2+blen/2);
		}
		else
		{
			if(blen%2==0)
				findMiddle(a, p1, p1+alen/2, b, p2+blen/2-1, q2);
			else
				findMiddle(a, p1, p1+alen/2, b, p2+blen, q2);
		}
	}
	
	public static int[] merge(int[] a, int p1, int q1, int[] b, int p2, int q2)
	{
		int alen = q1-p1+1;
		int blen = q2-p2+1;
		int[] ret = new int[alen+blen];
		int i,j,k;
		i=p1;
		j=p2;
		k=0;
		while(i<=q1 && j<=q2)
		{
			if(a[i]<b[j])
				ret[k++] = a[i++];
			else
				ret[k++] = b[j++];
		}
		while(i<=q1)
			ret[k++] = a[i++];
		while(j<=q2)
			ret[k++] = b[j++];
		return ret;
	}

}
