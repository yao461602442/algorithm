package HOJ;
import java.util.*;


public class OJ1070 {
	
	static class Milk
	{
		String brand;
		int price;
		int v;
		int day;
		double perDay;
		public Milk(String brand, int price, int v)
		{
			this.brand = brand;
			this.price = price;
			this.v = v;
			if(v<=1000)
			{
				day = v/200;
			}
			else
			{
				day = 5;
			}
			perDay = (double)price/day;
		}
		@Override
		public String toString()
		{
			return brand;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		String b;
		int p;
		int v;
		ArrayList<Milk> milks = new ArrayList<Milk>();
		for(int i=0; i<T; ++i)
		{
			int size = input.nextInt();
			
			for(int j=0; j<size; ++j)
			{
				b = input.next();
				
				p = input.nextInt();
				
				v = input.nextInt();
				//System.out.printf("b:%s, p:%d, v:%d%n", b,p,v);
				if(v<200)
					continue;
				Milk milk = new Milk(b, p, v);
				milks.add(milk);
			}
			Collections.sort(milks, new Comparator<Milk>(){

				@Override
				public int compare(Milk m1, Milk m2) {
					if(m1.perDay == m2.perDay)
					{
						if(m1.v > m2.v)
						{
							return -1;
						}
						return 1;
					}
					else if(m1.perDay > m2.perDay)
					{
						return 1;
					}
					else
					{
						return -1;
					}
				}
			});
			System.out.println(milks.get(0));
			milks.clear();
		}
		
	}

}
