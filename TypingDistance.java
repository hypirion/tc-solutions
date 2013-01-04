public class TypingDistance {

	public int minDistance(String keyboard, String word) {
		char[] kb = keyboard.toCharArray(),
			   wrd = word.toCharArray();
		char cur = wrd[0];
		int pos = keyboard.indexOf(cur);
		int sum = 0;
		for (char w : wrd){
			int npos = keyboard.indexOf(w);
			sum += Math.abs(pos-npos);
			pos = npos;
		}
		return sum;
	}

}
