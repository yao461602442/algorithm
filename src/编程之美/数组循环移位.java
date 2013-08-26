package 编程之美;

public class 数组循环移位 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
		move2(a, 4);
		for(int i=0; i<a.length; ++i)
			System.out.printf("%d ", a[i]);
		
	}
	//右移k位
	public static void move(int[] array, int k)
	{
		k%=array.length;
		while(k>0)
		{
			int tmp = array[array.length-1];
			for(int i=array.length-1; i>0; --i)
			{
				array[i] = array[i-1];
			}
			array[0] = tmp;
			--k;
		}
	}
	
	public static void move2(int[] array, int k)
	{
		k%=array.length;
		reverse(array, 0, k-1);
		reverse(array, k, array.length-1);
		reverse(array, 0, array.length-1);
	}
	
	public static void reverse(int[] array, int b, int e)
	{
		int tmp;
		for(;b<e ; b++,e--)
		{
			tmp = array[b];
			array[b] = array[e];
			array[e] = tmp;
		}
	}

}
