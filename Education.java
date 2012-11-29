public class Education {

	public int minimize(String desire, int[] tests) {
		int minAvg = ('D'-desire.charAt(0)+6)*10;
		int score = 0;
		for (int t : tests)
			score += t;
		int tot = tests.length+1;
		for (int i = 0; i <= 100; i++)
			if (minAvg*tot <= (score+i))
				return i;
		return -1;
	}

}
