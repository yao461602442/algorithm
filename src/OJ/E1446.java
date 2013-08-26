package OJ;
//���K�˻�����
import java.util.*;
public class E1446 {

	private static int n; //�����ĳ���
	private static int k; //�ָ����
	private static String snumber; //������
	private static int[][] M;//��ѽ��
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		k = input.nextInt();
		snumber = input.next();
		M=new int[n+1][n+1];
		int i,j;
		for(i=1; i<=n; ++i)
			M[i][1] = conv(0, i);
		
		for(j=2; j<=k; ++j)
		{
			//����Ϊ2~k�εĹ���
			for(i=j; i<=n; ++i)
			{
				//
				for(int t=j-1; t<i; ++t)
				{
					M[i][j] = Math.max(M[i][j], M[t][j-1]*conv(t, i-t));
				}
			}
		}
		System.out.println(M[n][k]);
		                                       
	}
	
	public static int conv(int start, int length)
	{
		String cut = snumber.substring(start, start+length);
		return Integer.parseInt(cut);
	}

}
