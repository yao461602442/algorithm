package OJ;
import java.util.*;
public class E1208_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int len = input.nextInt();
		Show[] shows = new Show[len*2];
		for(int i=0; i<shows.length; i+=2)
		{
			shows[i] = new Show(input.nextInt(), true);
			shows[i+1] = new Show(input.nextInt(), false);
		}
		
		Arrays.sort(shows, new Comparator<Show>(){
			@Override
			public int compare(Show s1, Show s2)
			{
				return s1.time-s2.time;
			}
		});
		
		int sum = 0;
		int cur = 0;
		for(int i=0; i<shows.length; ++i)
		{
			if(shows[i].isStart)
			{
				cur++;
			}
			else{
				cur--;
			}
			if((i == shows.length-1 || shows[i].time < shows[i+1].time) && cur > sum)
			{
				sum = cur;
			}
		}
		
		System.out.println(sum);
		
	}
	
	static class Show
	{
		int time;
		boolean isStart;
		public Show(int time, boolean isStart)
		{
			this.time = time;
			this.isStart = isStart;
		}
	}
}
