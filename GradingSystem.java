public class GradingSystem {

	public int fairness(int[] scores, int[] grades) {
		int N = scores.length;
		int[] gmax = new int[N], gmin = new int[N];
		int lowest = -1;
		for (int i = 0; i < N; i++){
			if (lowest < grades[i])
				lowest = grades[i];
			gmax[i] = lowest;
		}
		int highest = 9;
		for (int i = N-1; 0 <= i; i--){
			if (grades[i] < highest)
				highest = grades[i];
			gmin[i] = highest;
		}
		int s = 0;
		for (int i = 0; i < N; i++)
			s += Math.abs(gmax[i]-gmin[i]);
		return s;
	}

}
