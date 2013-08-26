package HOJ;
import java.util.*;
public class OJ1170 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=0; i<N; ++i)
		{
			String o=input.next();
			int a=input.nextInt();
			int b=input.nextInt();
			if(o.equals("/"))
			{
				if(a%b==0)
					System.out.printf("%d%n", a/b);
				else
					System.out.printf("%.2f%n", (double)a/b);
			}
			else if(o.equals("+"))
			{
				System.out.println(a+b);
			}
			else if(o.equals("-"))
			{
				System.out.println(a-b);
			}
			else
			{
				System.out.println(a*b);
			}
			
		}
		
	}

}
