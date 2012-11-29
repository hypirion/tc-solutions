public class Multiples {

	public int number(int min, int max, int factor) {
		int sum = 0;
		for (int i = min; i <= max; i++)
			if (i % factor == 0)
				sum++;
		return sum;
	}

}
