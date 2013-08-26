package HOJ;
import java.util.*;
public class OJ1157 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; ++i)
		{
			a[i] = input.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[a.length/2]);
	}

}
