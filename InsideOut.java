public class InsideOut {

	public String unscramble(String line) {
		char[] c = line.toCharArray();
		int N = c.length;
		for (int i = 0; i < N/4; i++){
			char t = c[i];
			c[i] = c[N/2-1-i];
			c[N/2-1-i] = t;
		}
		for (int i = N/2; i < N*3/4; i++){
			char t = c[i];
			c[i] = c[N*3/2-1-i];
			c[N*3/2-1-i] = t;
		}
		return new String(c);
	}

}
