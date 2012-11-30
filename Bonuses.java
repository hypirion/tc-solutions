import java.util.ArrayList;
import java.util.Collections;

public class Bonuses {

	public int[] getDivision(int[] points) {
		int N = points.length;
		int sum = 0;
		for (int p : points)
			sum += p;
		int[] pcs = new int[N];
		for (int i = 0; i < N; i++)
			pcs[i] = (points[i]*100)/sum;
		int ss = 100;
		for (int p : pcs)
			ss -= p;
		if (ss > 0){
			ArrayList<Integer> _pts = new ArrayList<Integer>();
			for (int i = 0; i < N; i++)
				_pts.add(points[i]);
			Collections.sort(_pts, Collections.reverseOrder());
			for (int i = 0; i < N; i++){
				int p = ss;
				for (int j = 0; j < ss; j++){
					if (_pts.get(j) == points[i]){
						p = j;
						_pts.remove(p);
						break;
					}
				}
				if (p < ss){
					pcs[i]++;
					ss--;
				}
			}
		}
		return pcs;
	}

}
