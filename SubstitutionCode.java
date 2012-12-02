public class SubstitutionCode {

	public int getValue(String key, String code) {
		key = key.charAt(9) + key;
		int sum = 0;
		for (char c : code.toCharArray())
			if (key.indexOf(c) != -1)
				sum = sum * 10 + key.indexOf(c);
		return sum;
	}

}
