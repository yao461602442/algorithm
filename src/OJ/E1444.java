package OJ;
//多重幂计数问题
import java.util.*;
public class E1444 {

	private static int n;
	private static int count;
	private static int[] p = new int[100] ;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		p[1] = p[2] = 1;
		p[3] = 2;
		
		for(int i=4; i<=n; ++i)
		{
			for(int j=1; j<i; ++j)
				p[i] += p[j] * p[i-j];
		}
		System.out.println(p[n]);
	}
	

}
