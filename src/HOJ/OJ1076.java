package HOJ;
import java.util.*;
public class OJ1076 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int line = input.nextInt();
		int start;
		int offset;
		while(line!=0)
		{
			start = input.nextInt();
			offset = input.nextInt();
			while(!isleap(start))
			{
				start++;
			}
			int tmp = start;
			offset--;
			while(offset!=0)
			{
				tmp +=4;
				if(isleap(tmp))
				{
					offset--;
				}
			}
			System.out.println(tmp);
			line--;
		}
		
	}
	
	public static boolean isleap(int year)
	{
		if((year%4==0 && year%100!=0) || year %400 ==0)
			return true;
		return false;
	}

}
