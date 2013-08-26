package HOJ;
import java.util.*;
public class OJ1202 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			int N=input.nextInt();
			Subject sub;
			double sumS = 0;
			double sumSp = 0;
			int subCount = 0;
			for(int i=0; i<N; ++i)
			{
				double s = input.nextDouble();
				double p = input.nextDouble();
				if(p<=-1)
					continue;
				sub = new Subject(s, p);
				sumS += sub.s;
				sumSp += sub.sp;
				subCount++;
			}
			
			if(subCount!=0)
			{
				double gpa= (double)sumSp/sumS;
				System.out.printf("%.2f%n",gpa);
				
			}
			else
				System.out.println(-1);
			
		}
		
	}
	
	static class Subject{
		double s;
		double p;
		int jidian;
		double sp;
		public Subject(double s, double p)
		{
			this.s = s;
			this.p = p;
			jidian = calJidian(p);
			sp = s*jidian;
		}
		
		private int calJidian(double score)
		{
			if(score>=90)
				return 4;
			else if(score>=80)
				return 3;
			else if(score>=70)
				return 2;
			else if(score>=60)
				return 1;
			else if(score>=0)
				return 0;
			else
				return -1;
		}
		
	}

}
