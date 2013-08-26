package HOJ;
import java.util.*;
public class 买年货 {

	
	static int n;
	static int v1;
	static int v2;
	static int k;
	static boolean[] x; //结果
	static int maxValue;
	static int curValue;
	static wupin[] W;
	static class wupin{
		int m;
		int f;
		int value;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			n = input.nextInt();
			v1 = input.nextInt();
			v2 = input.nextInt();
			k = input.nextInt();
			x = new boolean[n];
			W = new wupin[n];
			maxValue = curValue = 0;
			for(int i=0; i<n; ++i)
			{
				W[i] = new wupin();
				W[i].m = input.nextInt();
				W[i].f = input.nextInt();
				W[i].value = input.nextInt();
			}
			Arrays.sort(W, new Comparator<wupin>(){
				@Override
				public int compare(wupin w1, wupin w2)
				{
					return w1.value - w2.value;
				}
			});
			backtrack(0);
			System.out.println(maxValue);
			
		}
	}
	
	public static void backtrack(int t)
	{
		if(t==n)
		{
			if(curValue > maxValue)
				maxValue = curValue;
		}
		else
		{
			//先考虑换购
			if(k>0)
			{
				x[t] = true;
				--k;
				curValue += W[t].value;
				backtrack(t+1);
				x[t] = false;
				++k;
				curValue -= W[t].value;
			}
			if(v1 >= W[t].m && x[t] == false)
			{
				x[t] = true;
				v1-=W[t].m;
				curValue += W[t].value;
				backtrack(t+1);
				x[t] = false;
				v1+=W[t].m;
				curValue -= W[t].value;
			}
			//再考虑积分优先
			if(v2 >= W[t].f && x[t] == false)
			{
				x[t] = true;
				v2-=W[t].f;
				curValue += W[t].value;
				backtrack(t+1);
				x[t] = false;
				v2+=W[t].f;
				curValue -= W[t].value;
			}
			if(contrain(t+1))
				backtrack(t+1);
		}
	}
	
	public static boolean contrain(int k)
	{
		int tmpCur = curValue;
		int tv1 = v1;
		int tv2 = v2;
		for(int i=k; i<n; ++i)
		{
			if(tv1 > W[i].m)
			{	
				tmpCur+=W[i].value;
				tv1 -= W[i].m;
			}
			else if(tv2 > W[i].f)
			{
				tmpCur += W[i].value;
				tv2 -= W[i].f;
			}
		}
		if(tmpCur>maxValue)
			return true;
		return false;
	}
	

}
