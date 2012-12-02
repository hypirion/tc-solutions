import java.util.ArrayList;

public class ClassScores {

	public int[] findMode(int[] scores) {
		int[] pts = new int[101];
		int max = -1;
		for (int s : scores)
			max = Math.max(max, ++pts[s]);
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 101; i++)
			if (pts[i] == max)
				al.add(i);
		int[] ret = new int[al.size()];
		for (int i = 0; i < ret.length; i++)
			ret[i] = al.get(i);
		return ret;
	}

}
