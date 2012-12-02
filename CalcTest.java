public class CalcTest {

	public String[] uniform(String[] numbers) {
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = numbers[i].replaceAll(" ", "").replaceAll("[^0-9]", ".");
		return numbers;
	}

}
