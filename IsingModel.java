public class IsingModel {

	public int energy(String[] spins) {
		int row = spins.length, col = spins[0].length();
		char[][] cc = new char[row][];
		for (int r = 0; r < row; r++)
			cc[r] = spins[r].toCharArray();
		int s = 0;
		for (int r = 0; r < row; r++)
			for (int c = 0; c < col; c++){
				if (r+1 < row)
					s += cc[r][c] != cc[r+1][c] ? 1 : -1;
				if (c+1 < col)
					s += cc[r][c] != cc[r][c+1] ? 1 : -1;
			}
		return s;
	}

}
