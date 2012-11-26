public class WidgetRepairs {

	public int days(int[] arrivals, int numPerDay) {
		int left = 0;
		int w = 0;
		for (int a : arrivals){
			left += a;
			if (left != 0)
				w++;
			left = Math.max(left-numPerDay, 0);
		}
		while (0 < left){
			left -= numPerDay;
			w++;
		}
		return w;
	}

}
