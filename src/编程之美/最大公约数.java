package 编程之美;

public class 最大公约数 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd3(123,30));
	}
	
	public static int gcd1(int x, int y)
	{
		return (y==0) ? x : gcd1(y, x%y);
	}
	
	public static int gcd2(int x, int y)
	{
		if(x<y)
		{
			return gcd2(y, x);
		}
		else if(y == 0){
			return x;
		}
		else{
			return gcd2(x-y, y);
		}
	}
	
	public static int gcd3(int x, int y)
	{
		if(x<y)
			return gcd3(y, x);
		else if (y==0)
			return x;
		else{
			if((x&1)==0)
			{//x is even number
				if((y&1)==0)
					return (gcd3(x>>1, y>>1)<<1);
				else
					return gcd3(x>>1, y);
			}
			else
			{
				if((y&1)==0)
				{
					return (gcd3(x, y>>1));
				}
				else{
					return gcd3(x-y, y);
				}
			}
		}
	}
}
