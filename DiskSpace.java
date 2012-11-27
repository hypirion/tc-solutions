import java.util.Arrays;

public class DiskSpace {

	public int minDrives(int[] used, int[] total) {
		int N = used.length;
		int sum = 0;
		for (int u : used)
			sum += u;
		Arrays.sort(total);
		int cnt = 0, i = N-1;
		while (0 < sum){
			sum -= total[i--];
			cnt++;
		}
		return cnt;
	}

}
