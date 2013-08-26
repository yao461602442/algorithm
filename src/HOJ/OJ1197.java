package HOJ;
import java.util.*;
public class OJ1197 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2992; i<10000; ++i)
		{
			int ten = ten(i);
			int sixteen = sixteen(i);
			int twelve = twelve(i);
			if(ten==sixteen && sixteen == twelve)
			{
				System.out.println(i);
			}
		}
	}
	
	public static int ten(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	
	
	public static int sixteen(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum+=n%16;
			n/=16;
		}
		return sum;
	}
	public static int twelve(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum+=n%12;
			n/=12;
		}
		return sum;
	}
}
