public class Pronunciation {

	public String canPronounce(String[] words) {
		String vowels = "aeiou";
		for (String s : words){
			char p = ' ';
			int cons = 0;
			for (char c : s.toLowerCase().toCharArray()){
				if (0 <= vowels.indexOf(c)){
					if (p == c) continue;
					if (0 <= vowels.indexOf(p))
						return s;
					p = c;
					cons = 0;
				}
				else {
					cons++;
					p = ' ';
					if (cons >= 3)
						return s;
				}
			}
		}
		return "";
	}

}
