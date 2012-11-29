public class LetterStrings {

	public int sum(String[] ss) {
		int sum = 0;
		for (String s : ss)
			for (char c : s.toCharArray())
				if (c != '-')
					sum++;
		return sum;
	}

}
