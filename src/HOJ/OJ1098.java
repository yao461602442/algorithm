package HOJ;
import java.util.*;
public class OJ1098 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(gcd(11,3));
		Scanner input = new Scanner(System.in);
		int k;
		while(input.hasNext())
		{
			k = input.nextInt();
			if(18%gcd(65, k)==0)
			{
				for(int i=0; ; i++)
				{
					if((18+k*i)%65==0)
					{
						System.out.printf("%d%n", i);
						break;
					}
				}
				
			}
			else
				System.out.printf("no%n");
		}
		
	}
	
	public static int gcd(int m, int n)
	{
		int r =m%n;
		while(r!=0)
		{
			m=n;
			n=r;
			r = m%n;
		}
		return n;
	}
}
