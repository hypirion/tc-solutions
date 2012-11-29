public class GardenHose {

	public int countDead(int n, int rowDist, int colDist, int hoseDist) {
		int dead = 0;
		for (int r = 1; r <= n; r++)
			for (int c = 1; c <= n; c++)
				if (r*rowDist > hoseDist && (n-r+1)*rowDist > hoseDist
					&& c*colDist > hoseDist && (n-c+1)*colDist > hoseDist)
					dead++;
		return dead;
	}

}
