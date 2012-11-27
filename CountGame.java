import java.util.Arrays;

public class CountGame {

	public int howMany(int maxAdd, int goal, int next) {
		int[] toWin = new int[goal+1];
		Arrays.fill(toWin, -1);
		for (int i = goal; 0 <= i; i--)
			for (int j = 0; j < maxAdd && j + i <= goal; j++)
				if (i + j == goal)
					toWin[i] = j+1;
				else if (toWin[i+j+1] == -1)
					toWin[i] = j+1;
		return toWin[next];
	}

}
