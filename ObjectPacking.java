public class ObjectPacking {

	public int smallBox(int objWidth, int objLength, int[] boxWidth, int[] boxLength) {
		int N = boxWidth.length, areas[] = new int[N], best = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++)
			areas[i] = boxWidth[i]*boxLength[i];
		for (int i = 0; i < N; i++)
			if (objWidth <= boxWidth[i] && objLength <= boxLength[i])
				best = Math.min(best, areas[i]);
			else if (objLength <= boxWidth[i] && objWidth <= boxLength[i])
				best = Math.min(best, areas[i]);
		return best == Integer.MAX_VALUE ? -1 : best;
	}

}
