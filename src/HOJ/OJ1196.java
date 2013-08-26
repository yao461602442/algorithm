package HOJ;
import java.util.*;
public class OJ1196 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		while(k!=0)
		{
			
			System.out.println((((k-0x01)^(k))+1)>>1);
			 k = input.nextInt();
		}
		
	}

}
