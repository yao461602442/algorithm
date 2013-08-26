package HOJ;
import java.util.*;
public class OJ1106 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			String line  = input.nextLine();
			String[] integer = line.split("5");
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0; i<integer.length; ++i)
			{
				if(!integer[i].equals(""))
					list.add(Integer.parseInt(integer[i]));
			}
			Collections.sort(list);
			for(int i=0; i<list.size(); ++i)
			{
				
				if(i==list.size()-1)
					System.out.printf("%d%n", list.get(i));
				else
					System.out.printf("%d ", list.get(i));
			}
		}
	}

}
