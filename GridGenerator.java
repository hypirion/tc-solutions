public class GridGenerator {

	public int generate(int[] row, int[] col) {
		int N = row.length;
		int[][] mtx = new int[N][N];
		for (int i = 0; i < N; i++){
			mtx[0][i] = row[i];
			mtx[i][0] = col[i];
		}
		for (int i = 1; i < N; i++)
			for (int j = 1; j < N; j++)
				mtx[i][j] = mtx[i-1][j] + mtx[i][j-1] + mtx[i-1][j-1];
		return mtx[N-1][N-1];
	}

}
