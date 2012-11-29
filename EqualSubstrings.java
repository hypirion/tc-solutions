public class EqualSubstrings {

	public String[] getSubstrings(String str) {
		String[] s = new String[2];
		for (int i = str.length(); 0 <= i; i--){
			s[0] = str.substring(0, i);
			s[1] = str.substring(i);
			int cc = 0;
			for (char c : s[0].toCharArray())
				if (c == 'a')
					cc++;
			for (char c : s[1].toCharArray())
				if (c == 'b')
					cc--;
			if (cc == 0)
				break;
		}
		return s;
	}

}
