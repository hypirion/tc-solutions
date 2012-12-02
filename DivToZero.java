public class DivToZero {

	public String lastTwo(int num, int factor) {
		num /= 100;
		num *= 100;
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++)
				if ((num + 10*i+j) % factor == 0)
					return String.format("%d%d", i, j); 
		return null;
	}

}
