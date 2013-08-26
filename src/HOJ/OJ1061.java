package HOJ;
import java.util.*;
public class OJ1061 {

	/**
	 * @param args
	 */
	static ArrayList<Integer> A = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int line = input.nextInt();
		for(int i=0; i<line; ++i)
		{
			int n = input.nextInt();
			int rightMost = findRightMost(n);
			System.out.println(rightMost);
			
		}
		
	}
	
	public static int findRightMost(int n)
	{
		int curRight = n%10;
		A.add(-1);
		A.add(curRight);
		int tmp = curRight;
		while((tmp = (tmp*curRight)%10) != curRight)
		{
			A.add(tmp);
		}
		int index = n%(A.size()-1);
		int ret = -1;
		if(index == 0)
			ret = A.get(A.size()-1);
		else
			ret = A.get(index);
		A.clear();
		return ret;
	}
}
