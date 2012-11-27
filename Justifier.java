public class Justifier {

	public String[] justify(String[] textIn) {
		int max = 0;
		for (String s : textIn)
			if (max < s.length())
				max = s.length();
		for (int i = 0; i < textIn.length; i++)
			for (int j = max; textIn[i].length() < j;)
				textIn[i] = " " + textIn[i]; 
		return textIn;
	}

}
