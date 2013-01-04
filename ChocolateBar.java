public class ChocolateBar {

	public int maxLength(String letters) {
		char[] cc = letters.toCharArray();
		int N = cc.length;
		int best = 1;
		for (int i = N; 0 <= i; i--)
			for (int j = 0; j < i; j++){
				char[] d = new char[500];
				boolean rep = false;
				for (int k = j; k < i; k++)
					if (d[cc[k]]++ > 0) {
						rep = true;
						break;
					}
				if (!rep)
					best = Math.max(best, i-j);
			}
		return best;
	}

}
