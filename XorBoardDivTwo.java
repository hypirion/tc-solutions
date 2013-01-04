public class XorBoardDivTwo {

	public int theMax(String[] _board) {
		int Y = _board.length, X = _board[0].length(), max = -1;
		char[][] board = new char[_board.length][];
		for (int i= 0; i < _board.length; i++)
			board[i] = _board[i].toCharArray();
		
		for (int r = 0; r < Y; r++){
			for (int c = 0; c < X; c++){
				char[][] b = cpy(board);
				for (int c2 = 0; c2 < X; c2++){
					b[r][c2] = '1' == b[r][c2] ? '0' : '1'; 
				}
				for (int r2 = 0; r2 < Y; r2++){
					b[r2][c] =  '1' == b[r2][c] ? '0' : '1';
				}
				max = Math.max(count(b), max);
			}
		}
		return max;
	}
	
	public char[][] cpy(char[][] b){
		char[][] bb = new char[b.length][];
		for (int i = 0; i < bb.length; i++){
			bb[i] = new char[b[i].length];
			for (int j = 0; j < bb[i].length; j++){
				bb[i][j] = b[i][j];
			}
		}
		return bb;
	}
	
	public int count(char[][] board){
		int n = 0;
		for (char[] cc : board) for (char c : cc) if (c == '1')	n++;
		return n;
	}

}
