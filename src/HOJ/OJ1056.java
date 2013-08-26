package HOJ;
import java.util.*;
public class OJ1056 {

	static double cha = 0.00001;
	static double zero = 0.00;
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		int count=2;
		double sum = 0.00;
		while((n-zero) > cha)
		{
			
			int k=30;
			while(sum<n)
			{
				sum+=1/(double)count;
				count++;
				
			}
			System.out.printf("%d card(s)%n", count-2);
			count=2;
			sum=0.00;
			n=input.nextDouble();
		}
	}

}
