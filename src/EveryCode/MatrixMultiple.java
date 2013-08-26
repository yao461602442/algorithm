package EveryCode;

public class MatrixMultiple {
	
	private static int n = 6; //���ɵľ������
	private static int[] p = {30, 35, 15, 5, 10, 20, 25}; //p[0~n],����������������������
	private static int[][] M = new int[n+1][n+1]; //�洢�������˽����
	private static int[][] S = new int[n+1][n+1]; //�洢�ϵ�k  
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixChain();
		System.out.printf("A1~A6: %d", M[1][n]);
	}
	
	private static void MatrixChain()
	{
		//�Ե��������
		for(int i=1; i<=n; ++i) //����һ��
			M[i][i] = 0;
		for(int r=2; r<=n; ++r) //��2~n��
		{
			for(int i=1; i<=n-r+1; ++i)
			{
				int j=i+r-1;
				M[i][j] = M[i][i] + M[i+1][j] + p[i-1]*p[i]*p[j];
				S[i][j] = i;
				for(int k=i+1; k<j; ++k)
				{
					int tmp = M[i][k] + M[k+1][j] + p[i-1]*p[k]*p[j];
					if(tmp < M[i][j]){
						M[i][j] = tmp;
						S[i][j] = k;
					}						
				}
			}
		}
	}

}
