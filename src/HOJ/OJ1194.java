package HOJ;
import java.util.*;
public class OJ1194 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int sum;
		int diff;
		for(int i=0; i<T; ++i)
		{
			sum=input.nextInt();
			diff = input.nextInt();
			if(sum<diff)
				System.out.println("impossible");
			else
			{
				if((sum+diff)%2!=0)
					System.out.println("impossible");
				else
				{
					int a = (sum+diff)/2;
					int b = sum-a;
					System.out.printf("%d %d%n", a, b);
				}
				
			}
			
		}
		
	}

}
