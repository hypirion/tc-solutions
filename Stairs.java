public class Stairs {

	public int designs(int maxHeight, int minWidth, int totalHeight, int totalWidth) {
		int c = 0;
		for (int t = minWidth; t <= totalWidth; t++)
			for (int r = 1; r <= maxHeight; r++)
				if (totalWidth % t == 0 && totalHeight % r == 0 
					&& totalHeight/r == totalWidth/t+1)
					c++;
		return c;
	}

}
