package HOJ;
import java.util.*;
public class OJ1037 {

	static int w = 168;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int tmp;
		while(input.hasNext())
		{
			tmp = input.nextInt();
			if(tmp<=w)
			{
				System.out.printf("CRASH %d%n",tmp);
				System.exit(0);
			}
		}
		System.out.println("NO CRASH");
	}

}
