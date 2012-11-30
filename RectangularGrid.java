public class RectangularGrid {

	public long countRectangles(int col, int row) {
		long s = 0;
		for (int r = 1; r <= row; r++)
			for (int c = 1; c <= col; c++)
				if (c == r)
					continue;
				else
					s+=(row-r+1)*(col-c+1);
		return s;
	}

}
