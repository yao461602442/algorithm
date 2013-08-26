package OJ;
import java.util.*;
//不用comparator怎么办
public class E1208 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		Show[] shows = new Show[length];
		boolean[] select = new boolean[length];
		for(int i=0; i<length; ++i)
		{
			shows[i] = new Show(input.nextInt(), input.nextInt());
		}
		
		Arrays.sort(shows, new Comparator<Show>(){

			@Override
			public int compare(Show s1, Show s2) {
				// TODO Auto-generated method stub
				if(s1.end == s2.end){
					if(s1.start < s2.start)
						return -1;					
					else if(s1.start > s2.start)
						return 1;
					else
						return 0;
				}
				else if(s1.end < s2.end)
					return -1;
				else 
					return 1;
			}
			
		});
		
		int sum = 0;
		int cur = 0;
		do{
			sum=cur;
			int pre=-1;
			for(int i=0; i<length; ++i){
				if(!select[i])
				{
					pre = i;
					select[i] = true;
					cur++;
					break;
				}
			}
			if(pre == -1)
				break;
			for(int i=pre+1; i<length; ++i)
			{
				if(!select[i] && shows[i].start >= shows[pre].end)
				{
					pre = i;
					select[i] = true;
				}
			}
				
		}while(cur>sum);
		
		System.out.println(sum);
	}
	
	static class Show 
	{
		int start;
		int end;
		
		public Show(int start, int end)
		{
			this.start = start;
			this.end = end;
		}
	}
	
	

}
