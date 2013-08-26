package HOJ;
import java.util.*;
public class OJ1108 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(l(6,3));
		Scanner input = new Scanner(System.in);
		int m,n; 
		while(input.hasNext())
		{
			m=input.nextInt();
			n=input.nextInt();
			System.out.println(l(m,n));
		}
		
	}
	
	public static int gcd(int a, int b)
	{
		return a%b==0 ? b : gcd(b, a%b);
	}
	
	public static int l(int a, int b)
	{
		return a*b/gcd(a,b);
	}
}
