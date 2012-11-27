public class Substitute {

	public int getValue(String key, String code) {
		char[] k = key.toCharArray(),
			   cc = code.toCharArray();
		int v = 0;
		top:
		for (char c : cc)
			for (int i = 0; i < 10; i++)
				if (c == k[i]) {
					v = v * 10 + (i+1)%10;
					continue top;
				}
		return v;
	}

}
