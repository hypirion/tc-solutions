public class CrossWord {

	public int countWords(String[] board, int size) {
		int sum = 0;
		for (String s : board){
			int p = 0;
			for (char c : s.toCharArray()){
				if (c == '.')
					p++;
				if (c == 'X'){
					if (size == p)
						sum++;
					p = 0;
				}
			}
			if (size == p)
				sum++;
		}
		return sum;
	}

}
