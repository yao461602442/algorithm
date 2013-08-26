package hero;

import java.math.BigInteger;

public class »ØÎÄ×Ö·û´® {

	/**
	 * @param args
	 */
	static BigInteger[] jiechen = {
		new BigInteger("1"), new BigInteger("1"), new BigInteger("2"),new BigInteger("6"), new BigInteger("24"),
		new BigInteger("120"), new BigInteger("720"), new BigInteger("5040"),new BigInteger("40320"), new BigInteger("362880"),
		new BigInteger("3628800"), new BigInteger("39916800"), new BigInteger("479001600"),new BigInteger("227020758"), new BigInteger("178290591"),
		new BigInteger("674358851"), new BigInteger("789741546"), new BigInteger("425606191"),new BigInteger("660911389"), new BigInteger("557316307"),
		new BigInteger("146326063"), new BigInteger("72847302"), new BigInteger("602640637"),new BigInteger("860734560"), new BigInteger("657629300"),
		new BigInteger("440732388"), new BigInteger("459042011"), new BigInteger("394134213"),new BigInteger("35757887"), new BigInteger("36978716"),
		new BigInteger("109361473"), new BigInteger("390205642"), new BigInteger("486580460"),new BigInteger("57155068"), new BigInteger("943272305"),
		new BigInteger("14530444"), new BigInteger("523095984"), new BigInteger("354551275"),new BigInteger("472948359"), new BigInteger("444985875"),
		new BigInteger("799434881"), new BigInteger("776829897"), new BigInteger("626855450"),new BigInteger("954784168"), new BigInteger("10503098"),
		new BigInteger("472639410"), new BigInteger("741412713"), new BigInteger("846397273"),new BigInteger("627068824"), new BigInteger("726372166"),
		new BigInteger("318608048"),
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindrome("aaaaaabbbb"));
		
	}
	public static int palindrome(String s){
		int[] count=new int[26];
		for(int i=0; i<count.length; ++i)
			count[i] = 0;
		for(int i=0; i<s.length(); ++i)
		{
			char c = s.charAt(i);
			count[c-97] ++; 
		}
		int sum = 0;
		for(int i=0; i<count.length; ++i)
		{
			count[i]>>=1;
			sum+=count[i];
		}
		//System.out.println("sum="+sum);
		BigInteger fenzi = jiechen[sum];
		BigInteger fenmu = new BigInteger(1+"");
		for(int i=0; i<count.length;++i)
		{
			if(count[i]!=0)
				fenmu = fenmu.multiply(jiechen[count[i]]);
		}
		fenmu = fenmu.mod(new BigInteger("1000000007"));
		return fenzi.divide(fenmu).mod(new BigInteger("1000000007")).intValue();
	}
	
	public static BigInteger jiechen(int n)
	{
		BigInteger sum = new BigInteger("1");
		if(n==0 || n==1)
			return sum;
		for(int i=2; i<=n; ++i)
		{
			sum = sum.multiply(new BigInteger(i+""));
		}
		return sum.mod(new BigInteger("1000000007"));
	}
	
}
