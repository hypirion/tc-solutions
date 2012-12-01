import java.util.Arrays;

public class PastingPaintingDivOne {

	public long[] countColors(String[] sclipboard, int T) {
		int row = sclipboard.length, col = sclipboard[0].length(); 
		char[][] cb = new char[row][col];
		for (int r = 0; r < row; r++)
			cb[r] = sclipboard[r].toCharArray();
		long RGB[] = new long[4];
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
					RGB["RGB".indexOf(c)+1]++;
			return new long[]{RGB[1], RGB[2], RGB[3]};
		}
		long[][] down = new long[51][4];
		char[][] img = new char[cb.length][cb[0].length];
		for (int r = 0; r < row; r++)
			for (int c = 0; c < col; c++)
				img[r][c] = cb[r][c];
		for (int i = 0; i < 51; i++){
			for (int r = 0; r < row; r++)
				down[i]["RGB".indexOf(img[r][0])+1]++;
			for (int c = 1; c < col; c++)
				down[i]["RGB".indexOf(img[0][c])+1]++;
			for (int r = 0; r < row; r++)
				for (int c = 0; c < col; c++)
					if (0 <= r-i && 0 <= c-i && img[r-i][c-i] == '.')
						img[r-i][c-i] = cb[r][c];
		}
		for (int i = 1; i < 50; i++)
			for (int j = 0; j < 4; j++)
				RGB[j] += down[i][j];
		for (int j = 0; j < 4; j++)
			RGB[j] += down[50][j]*(T-49);
		for (int r = 1; r < row; r++)
			for (int c = 1; c < col; c++)
				RGB["RGB".indexOf(img[r][c])+1]++;
		return new long[]{RGB[1], RGB[2], RGB[3]};
	}

}
