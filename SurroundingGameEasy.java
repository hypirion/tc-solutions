public class SurroundingGameEasy {

	public int score(String[] cost, String[] benefit, String[] stone) {
		int row = cost.length, col = cost[0].length();
		int sum = 0;
		for (int r = 0; r < row; r++)
			for (int c = 0; c < col; c++){
				int s = 0;
				for (int[] v : new int[][]{{1,0},{-1,0},{0,1},{0,-1}}){
					int nr = r + v[0], nc = c + v[1];
					if (nr < 0 || row <= nr || nc < 0 || col <= nc || stone[nr].charAt(nc) == 'o')
						s++;
				}
				if (stone[r].charAt(c) == 'o'){
					sum -= cost[r].charAt(c) - '0';
					sum += benefit[r].charAt(c) - '0';
				}
				else if (s == 4) {
					sum += benefit[r].charAt(c) - '0';
				}
			}
		return sum;
	}

}
