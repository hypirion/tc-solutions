import java.util.Arrays;

public class PastingPaintingDivOne {

	public long[] countColors(String[] sclipboard, int T) {
		int row = sclipboard.length, col = sclipboard[0].length(); 
		char[][] cb = new char[row][col];
		for (int r = 0; r < row; r++)
			cb[r] = sclipboard[r].toCharArray();
		long RGB[] = new long[3];
		if (T <= 100){
			char[][] pp = new char[row+T][col+T];
			for (char[] p : pp)
				Arrays.fill(p, '.');
			for (int i = 0; i < T; i++)
				for (int r = 0; r < row; r++)
					for (int c = 0; c < col; c++)
						if (cb[r][c] != '.')
							pp[r+i][c+i] = cb[r][c];
			for (char[] p : pp)
				for (char c : p)
					if (c == 'R')
						RGB[0]++;
					else if (c == 'G')
						RGB[1]++;
					else if (c == 'B')
						RGB[2]++;
			return RGB;
		}
		long[][] down = new long[51][3];
		char[][] img = new char[cb.length][cb[0].length];
		for (int r = 0; r < row; r++)
			for (int c = 0; c < col; c++)
				img[r][c] = cb[r][c];
		for (int i = 0; i < 51; i++){
			for (int r = 0; r < row; r++)
				if (img[r][0] == 'R')
					down[i][0]++;
				else if (img[r][0] == 'G')
					down[i][1]++;
				else if (img[r][0] == 'B')
					down[i][2]++;
			for (int c = 1; c < col; c++)
				if (img[0][c] == 'R')
					down[i][0]++;
				else if (img[0][c] == 'G')
					down[i][1]++;
				else if (img[0][c] == 'B')
					down[i][2]++;
			for (int r = 0; r < row; r++)
				for (int c = 0; c < col; c++)
					if (0 <= r-i && 0 <= c-i && img[r-i][c-i] == '.')
						img[r-i][c-i] = cb[r][c];
		}
		for (int i = 1; i < 50; i++)
			for (int j = 0; j < 3; j++)
				RGB[j] += down[i][j];
		for (int j = 0; j < 3; j++)
			RGB[j] += down[50][j]*(T-49);
		for (int r = 1; r < row; r++)
			for (int c = 1; c < col; c++)
				if (img[r][c] == 'R')
					RGB[0]++;
				else if (img[r][c] == 'G')
					RGB[1]++;
				else if (img[r][c] == 'B')
					RGB[2]++;
		return RGB;
	}

}
