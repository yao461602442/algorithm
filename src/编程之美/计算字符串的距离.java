package 编程之美;

public class 计算字符串的距离 {
	static int[][] Map;
	/**
	 * @param args
	 */
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "zhengjigyaoasdfweaf";
		String s2 = "zhengjinghuigwefe";
		Map = new int[s1.length()+1][s2.length()+1];
		for(int i=0; i<Map.length; ++i)
		{
			for(int j=0; j<Map[i].length;++j)
				Map[i][j] = -1;
		}
		System.out.println(calculateDistance(s1, 0, s1.length()-1, s2, 0, s2.length()-1));
		System.out.println("递归次数:"+count);
	}
	
	public static int calculateDistance(String s1, int b1, int e1, 
											String s2, int b2, int e2)
	{
		count ++; //计算递归次数
		if(b1>e1)
		{
			if(b2>e2)
				return 0;
			else
				return e2-b2+1;
		}
		if(b2>e2)
		{
			if(b1>e1)
				return 0;
			else
				return e1-b1+1;
		}
		
		if(Map[b1][b2] != -1)
			return Map[b1][b2];
		
		//
		if(s1.charAt(b1) == s2.charAt(b2))
		{
			return calculateDistance(s1, b1+1, e1, s2, b2+1, e2);
		}
		else
		{
			int t1 = calculateDistance(s1, b1+1, e1, s2, b2, e2);
			int t2 = calculateDistance(s1, b1, e1, s2, b2+1, e2);
			int t3 = calculateDistance(s1, b1+1, e1, s2, b2+1, e2);
			//return minNum(t1, t2, t3)+1;
			Map[b1][b2] = minNum(t1, t2, t3)+1;
			return Map[b1][b2];
		}
	}
	
	
	public static int minNum(int a, int b, int c)
	{
		if(a>b)
		{
			return b>c ? c : b;
		}
		else{
			return a>c? c : a;
		}
	}
}
