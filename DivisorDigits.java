public class DivisorDigits {

	public int howMany(int number) {
		char[] n = Integer.toString(number).toCharArray();
		int sum = 0;
		for (char c : n)
			if (c == '0') continue;
			else if ((number % (c-'0')) == 0)
				sum++;
		return sum;
	}

}
