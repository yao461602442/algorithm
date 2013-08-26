package HOJ;
import java.util.*;

public class OJ1201 {
	
	static int[] day1 = {0, 31, 28, 31, 30, 31, 30, 31, 31,  30, 31, 30, 31};
	static int[] day2 = {0, 31, 29, 31, 30, 31, 30, 31, 31,  30, 31, 30, 31};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int T = input.nextInt();
		int[] data = new int[3];
		for(int i=0; i<T; ++i)
		{
			String line = input.next();			
			String[] s = line.split("-");
			for(int j=0; j<s.length; ++j)
				data[j] = Integer.parseInt(s[j]);
			int sum=0;
			
			if(isleap(data[0]) && data[2]==29 && !isleap(data[0]+18))
			{
				System.out.println(-1);
				continue;
			}
			for(int k=0; k<=18; ++k)
			{
				if(isleap(data[0]+k))
				{
					if(k==0)
					{
						sum+= count(day2, data[1], 12)-data[2];
					}
					else if(k==18)
					{
						sum+= count(day2, 1, data[1]-1)+data[2];
					}
					else
					{
						sum+=366;
					}	
				}
				else
				{
					if(k==0)
						sum+= count(day1, data[1], 12)-data[2];
					else if(k==18)
						sum+=count(day1, 1, data[1]-1)+data[2];
					else
						sum+=365;
				}
			}
			System.out.println(sum);
		}
	}
	
	public static boolean isleap(int year)
	{
		if((year%4==0 && year%100!=0) || year%400 == 0)
			return true;
		else
			return false;
	}
	
	public static int count(int[] day, int start, int end)
	{
		int sum=0;
		for(int i=start; i<=end; ++i)
		{
			sum+=day[i];
		}
		return sum;
	}
}
