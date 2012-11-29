import java.util.Arrays;

public class TeamSplit {

	public int difference(int[] strengths) {
		Arrays.sort(strengths);
		int[] a = new int[2];
		for (int i = strengths.length - 1; 0 <= i; i--)
			a[i&1] += strengths[i];
		return Math.abs(a[0]-a[1]);
	}

}
