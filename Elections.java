public class Elections {

	public int visit(String[] likelihoods) {
		int N = likelihoods.length;
		int index = -1;
		double p = 1.1;
		for (int i = 0; i < N; i++){
			int one = 0;
			for (char c : likelihoods[i].toCharArray())
				if (c == '1')
					one++;
			double pp = one/((double)likelihoods[i].length());
			if (pp < p){
				index = i;
				p = pp;
			}
		}
		return index;
	}

}
