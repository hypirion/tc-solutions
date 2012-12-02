import java.util.HashSet;

public class Party {

	public double averageNames(int N, int[] personA, int[] personB) {
		HashSet<Integer>[] all = new HashSet[N];
		for (int i = 0; i < N; i++){
			all[i] = new HashSet<Integer>();
			all[i].add(i);
		}
		int M = personA.length;
		for (int i = 0; i < M; i++){
			all[personA[i]].addAll(all[personB[i]]);
			all[personB[i]].addAll(all[personA[i]]);
		}
		int s = 0;
		for (HashSet<Integer> hs : all)
			s += hs.size();
		s -= N;
		return s/((double)N);
	}

}
