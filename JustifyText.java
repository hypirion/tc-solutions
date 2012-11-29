public class JustifyText {

	public String[] format(String[] text) {
		int max = 0;
		for (String s: text)
			max = Math.max(s.length(), max);
		for (int i = 0; i < text.length; i++)
			while (text[i].length() < max)
				text[i] = " " + text[i];
		return text;
	}

}
