public class GuessTheNumber {

	public int noGuesses(int upper, int answer) {
		int lower = 1, x = -1, c = 0;
		do {
			x = (lower + upper)/2;
			System.out.println(x);
			if (x < answer)
				lower = x + 1;
			else if (answer < x)
				upper = x - 1;
			c++;
		} while (x != answer);
		return c;
	}

}
