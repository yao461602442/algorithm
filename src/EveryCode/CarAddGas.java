package EveryCode;

import java.util.*;

public class CarAddGas {

	static int n;
	static int k;
	static int[] road;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		k = input.nextInt();
		road = new int[k + 1];

		for (int i = 0; i < road.length; ++i) {
			road[i] = input.nextInt();
			if (road[i] > n) {
				System.out.println("No Solution!");
				System.exit(0);
			}

		}
		int gas = n;
		int count = 0;
		for (int i = 0; i < road.length; ++i) {
			if(gas>=road[i]) //>= 
				gas-=road[i];
			else{
				gas=n-road[i];
				count++;
			}
		}
		System.out.println(count);

	}

}
