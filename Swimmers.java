public class Swimmers {

	public int[] getSwimTimes(int[] d, int[] s, int c) {
		int N = d.length;
		for (int i = 0; i < N; i++)
			if (d[i] == 0)
				continue;
			else if (s[i] <= c)
				d[i] = -1;
			else
				d[i] = (int)(d[i]/(s[i]+(double)c) + d[i]/(s[i]-(double)c)); 
		return d;
	}

}
