package HOJ;
import java.util.*;
public class OJ1097 {

	static ArrayList<Integer> a = new ArrayList<Integer>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number;
		int mi;
		while(input.hasNext())
		{
			number = input.nextInt();
			mi = input.nextInt();
			constructA(number);
			int size = a.size();
			int index = mi%size;
			if(index==0)
				System.out.println(a.get(a.size()-1));
			else
			{
				System.out.println(a.get(index-1));
			}
			
			a.clear();
		}
		
		
	}
	
	public static void constructA(int number)
	{
		int last = number%10;
		a.add(last);
		int tmp = last;
		while((tmp = (tmp*last)%10) != last)
		{
			a.add(tmp);
		}
		
	}
}
