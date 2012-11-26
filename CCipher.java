public class CCipher {

	public String decode(String cipherText, int shift) {
		char[] c = cipherText.toCharArray();
		for (int i = 0; i < c.length; i++){
			c[i]-=shift;
			if (c[i] < 'A')
				c[i] += 26;
		}
		return new String(c);
	}

}
