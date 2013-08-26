package OJ;

import java.util.*;

/**
 * input: 5 n 2 6 2 3 6 5 5 4 4 6 10 c output: 15
 * 
 */

// 0-1�������⣬���ݷ����
public class ZeroOnePackage {
	static int n; // ��Ʒ����
	static int c; // ��������
	static Thing[] things; // ��Ʒ
	static int bestp; // ����ֵ��
	static int cp; // ��ǰ��ֵ��
	static int cw; // ��ǰ��������
	static int[] x; // ��ʾ����·��
	static class Thing {
		int w; // ����
		int p; // ��ֵ
		float ratio; // ��ֵ������,����λ������ռ��ֵ
		public Thing(int w, int p, float ratio) {
			this.w = w;
			this.p = p;
			this.ratio = ratio;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();		
		x = new int[n + 1];
		things = new Thing[n + 1];
		int tmpw; 
		int tmpp;
		float r = 0;
		for (int i = 1; i <= n; ++i) {
			tmpw = input.nextInt();
			tmpp = input.nextInt();
			r = (float) (tmpp) / tmpw;
			things[i] = new Thing(tmpp, tmpw, r);
		}
		c = input.nextInt();
		Arrays.sort(things, 1, n + 1, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// �Ӵ�С����
				Thing t1 = (Thing) o1;
				Thing t2 = (Thing) o2;
				if (t1.ratio < t2.ratio)
					return 1;
				else if (t1.ratio > t2.ratio)
					return -1;
				else
					return 0;
			}
		});
		backtrack(1);
		System.out.println(bestp);
	}

	public static void backtrack(int t) {
		if (t > n) {
			if (bestp < cp)
				bestp = cp;
		} else {
			if (cw + things[t].w <= c) {
				x[t] = 1;
				cw += things[t].w;
				cp += things[t].p;
				backtrack(t + 1);
				cw -= things[t].w;
				cp -= things[t].p;
				x[t] = 0;
			}
			if (bestp < bound(t + 1)) 
				backtrack(t + 1);
		}
	}

	public static int bound(int k) {
		int cleft = c - cw;
		int curValue = cp;
		while (k <= n && things[k].w <= cleft) {
			cleft -= things[k].w;
			curValue += things[k].p;
			k++;
		}
		if (k <= n)
			curValue += things[k].p * cleft / things[k].w;
		return curValue;
	}

}
