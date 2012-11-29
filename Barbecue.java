import java.util.Arrays;

public class Barbecue {

	public int eliminate(int N, int[] voter, int[] excluded) {
		int[] foo = new int[N];
		for (int i = 0; i < voter.length; i++)
			foo[excluded[i]]++;
		int max = 0;
		for (int f : foo)
			max = Math.max(f, max);
		int nmax = 0;
		for (int f : foo)
			if (f == max)
				nmax++;
		if (nmax == 1)
			for (int i = 0 ; i < N; i++)
				if (foo[i] == max)
					return i;
		int[] vCount = new int[N];
		Arrays.fill(vCount, -1);
		for (int i = 0; i < N; i++)
			if (foo[i] == max)
				vCount[i] = 0;
		for (int v : voter)
			if (foo[v] == max)
				vCount[v]++;
		max = 0;
		for (int v : vCount)
			max = Math.max(v, max);
		nmax = 0;
		for (int v : vCount)
			if (v == max)
				nmax++;
		for (int i = 0 ; i < N; i++)
			if (vCount[i] == max)
				return i;
		return -1;
	}

}
