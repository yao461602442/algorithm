package EveryCode;
import java.util.*;

public class ZeroOnePackage {
	static Thing[] things;
	static int bestp;
	static int cp;
	static int cw;
	static int c;
	static int n;
	static class Thing
	{
		int w;
		int p;
		float ratio;
		 public Thing(int w, int p, float ratio)
		{
			this.w = w;
			this.p = p;
			this.ratio = ratio;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		things = new Thing[n+1];
		int tmpW;
		int tmpP;
		for(int i=1; i<=n; ++i)
		{
			tmpW = input.nextInt();
			tmpP = input.nextInt();
			things[i] = new Thing(tmpW, tmpP, (float)(tmpP)/tmpW);
		}
		c = input.nextInt();
		System.out.println("sdf");
		//注意 这里排序要指定范围 不然会nullpointer！ 范围是1~n+1
		Arrays.sort(things,1, n+1, new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				Thing t1 = (Thing)o1;
				Thing t2 = (Thing)o2;
				if(t1.ratio < t2.ratio)
					return -1;
				if(t2.ratio > t2.ratio)
					return 1;
				return 0;
			}
		});
		System.out.println("sdf");
		backtrack(1);
		System.out.println(bestp);
	}
	
	public static void backtrack(int t)
	{
		if(t>n)
		{
			if(cp > bestp) bestp = cp;
		}
		else{
			if(cw+things[t].w <= c)
			{
				cw+=things[t].w;
				cp+=things[t].p;
				backtrack(t+1);
				cw-=things[t].w;
				cp-=things[t].p;
			}
			if(bestp < bound(t+1))
			{
				backtrack(t+1);
			}
		}
	}
	
	public static int bound(int t)
	{
		int leftw = c-cw; 
		int cValue = cp;
		while(t<=n && leftw >= things[t].w) //等号啊！
		{
			
			leftw -= things[t].w;
			cValue+= things[t].p;
			t++;
			
		}
		if(t<=n) cValue += things[t].p * (leftw) / things[t].w;
		return cValue;
	}
	

}
