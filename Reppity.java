public class Reppity {

	public int longestRep(String input) {
		int N = input.length(), max = 0;
		for (int i = 0; i < N; i++)
			for (int j = i+1; j <= N; j++){
				String hit = input.substring(i,j),
					   r = input.substring(j);
				if (r.contains(hit))
					max = Math.max(max, hit.length());
			}
		return max;
	}

}
