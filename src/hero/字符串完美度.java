package hero;

import java.util.Arrays;
import java.util.Comparator;

public class ×Ö·û´®ÍêÃÀ¶È {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(perfect("dad"));
	}
	
	public static int perfect(String s){
		s = s.toLowerCase();
		Integer[] array = new Integer[26];
		for(int i=0; i<array.length; ++i)
		{
			array[i] = 0;
		}
		
		for(int i=0; i<s.length(); ++i)
		{
			array[s.charAt(i)-97]++;
		}
		Arrays.sort(array, new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}

			
		});
		int sum=0;
		for(int i=0; i<array.length;++i)
		{
			sum+=array[i]*(26-i);
		}
		return sum;
	}
}
