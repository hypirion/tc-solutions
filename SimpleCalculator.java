public class SimpleCalculator {

	public int calculate(String input) {
		String[] a = input.split("[+\\-*/]", -1);
		char op = input.charAt(a[0].length());
		switch (op) {
		case '+': return Integer.parseInt(a[0], 10) + Integer.parseInt(a[1], 10);
		case '-': return Integer.parseInt(a[0], 10) - Integer.parseInt(a[1], 10);
		case '*': return Integer.parseInt(a[0], 10) * Integer.parseInt(a[1], 10);
		case '/': return Integer.parseInt(a[0], 10) / Integer.parseInt(a[1], 10);
		}
		return 0;
	}

}
