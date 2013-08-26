package HOJ;
import java.util.*;
public class OJ1040 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int line = input.nextInt();
		int total;
		Integer[] array;
		for(int i=0; i<line; ++i)
		{
			total = input.nextInt();
			array = new Integer[total];
			for(int j=0; j<total; ++j)
			{
				array[j] = input.nextInt();
			}
			Arrays.sort(array);
			for(int j=0; j<array.length-1; ++j)
			{
				System.out.printf("%d ", array[j]);
			}
			System.out.printf("%d%n", array[total-1]);
			
		}
	}
}
