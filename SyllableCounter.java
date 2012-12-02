public class SyllableCounter {

	public int countSyllables(String word) {
		int s = 0;
		for (String ss : word.split("[^AEIOU]+"))
			if (0 < ss.length())
				s++;
		return s;
	}

}
