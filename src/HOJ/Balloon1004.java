package HOJ;
import java.util.*;
public class Balloon1004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		
		while(n!=0)
		{
			String line;
			TreeMap<String, Integer> map = new TreeMap<String, Integer>(); 
			for(int i=0; i<n; ++i)
			{
				line = input.next();
				addB(map, line);
			}
			int typeCount = map.size();
			Balloon[] balloons = new Balloon[typeCount];
			Set<Map.Entry<String, Integer>> set = map.entrySet();
			Iterator<Map.Entry<String, Integer>> iter = set.iterator();
			int index = 0;
			while(iter.hasNext())
			{
				Map.Entry<String, Integer> entry = iter.next();
				balloons[index] = new Balloon();
				balloons[index].name = entry.getKey();
				balloons[index].count = entry.getValue();
				index++;
			}
			
			Arrays.sort(balloons, new Comparator<Balloon>(){
				@Override
				public int compare(Balloon b1, Balloon b2)
				{
					return b2.count - b1.count;
				}
			});
			System.out.println(balloons[0].name);
			map = null;
			balloons = null;
			n=input.nextInt();
		}
		
	}
	
	public static void addB(Map<String, Integer> map, String balloon)
	{
		if(map.containsKey(balloon))
		{
			int tmp = map.get(balloon);
			map.put(balloon, tmp+1);
		}
		else
		{
			map.put(balloon, 1);
		}
	}
	
	static class Balloon{
		String name;
		int count;
	}
}
