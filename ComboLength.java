public class ComboLength {

	public int howLong(String moves) {
		int max = -1, cur = 0;
		char prev = ' ';
		for (char c : moves.toCharArray())
			if (prev != c){
				prev = c;
				max = Math.max(cur, max);
				cur = 1;
			}
			else
				cur++;
		return Math.max(cur, max);
	}

}
