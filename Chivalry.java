public class Chivalry {

	public String getOrder(String first, String second) {
		char[] f = first.toCharArray(),
			   s = second.toCharArray();
		int i = 0, j = 0, iN = f.length, jN = s.length;
		String res = "";
		while (i < iN || j < jN)
			if (i == iN)
				res += s[j++];   
			else if (j == jN)
				res += f[i++];
			else if (f[i] == s[j])
				res += f[i++];
			else if (f[i] == 'W')
				res += f[i++];
			else if (s[j] == 'W')
				res += s[j++];
		return res;
	}

}
