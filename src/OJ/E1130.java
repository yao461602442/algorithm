package OJ;
import java.util.*;
//最长递增子序列
public class E1130 {

	static int n;
	static int[] list;
	static int[] t;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		list = new int[n];
		t = new int[n];
		
		int i, j,k;
		for(i=0;i<n;++i)
			list[i] = input.nextInt();
		
		for(i=1,t[0]=1; i<n; ++i){
			for(j=0, k=0; j<i; ++j){
				if((list[j] < list[i])&&(k<list[j]))
					k = t[j];
			}
			t[i] = k+1;
		}
		
		k=t[0];
		for(i=0; i<n; ++i)
		{
			if(k<t[i])
				k=t[i];
		}
		
		System.out.println(k);
		
	}

}
