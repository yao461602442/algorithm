package hero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ForjobClass {
	public static int forjob(int[] start, int[] end) {
		Activity[] activities = new Activity[start.length];
		
		for(int i=0; i<activities.length; ++i)
		{
			activities[i] = new Activity(start[i], end[i]);
		}
		
		Arrays.sort(activities, new Comparator<Activity>() {

			@Override
			public int compare(Activity o1, Activity o2) {
				return o1.end-o2.end;
			}		
		});
		int n=0;
		int j=0;
		for(int i=1; i<activities.length; i++)
		{
			if(activities[j].start < activities[i].end){
				n++;
				j=i;
			}
		}
		return n;
	}
	static class Activity{
		int start;
		int end;
		public Activity(int start, int end){
			this.start = start;
			this.end = end;
		}
	}

	// start 提示：自动阅卷起始唯一标识，请勿删除或增加。
	public static void main(String args[]) {
		int[] start = {9,10,8};
		int[] end = {10, 20, 15};
		System.out.println(forjob(start, end));
	}
	// end //提示：自动阅卷结束唯一标识，请勿删除或增加。
}