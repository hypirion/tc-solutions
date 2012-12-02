public class BalancedGame {

	public int result(String[] conflicts, int p, int q) {
		int N = conflicts.length, 
			pmin = (int) Math.ceil((N-1.0)*p/100.0),
			qmin = (int) Math.ceil((N-1.0)*q/100.0);
		for (int i = 0; i < N; i++){
			int[] wlt = new int[3];
			for (int j = 0; j < N; j++)
				wlt["WLT".indexOf(conflicts[i].charAt(j))]++;
			if (pmin <= wlt[0] && qmin <= wlt[1])
				continue;
			else
				return i;
		}
		return -1;
	}

}
