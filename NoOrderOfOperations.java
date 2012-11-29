public class NoOrderOfOperations {

	public int evaluate(String expr) {
		return evaluate(0, '+', expr);
	}
	
	public int evaluate(int v, char c, String expr){
		String[] s = expr.split("[+\\-*]", 2);
		int v2 = Integer.parseInt(s[0], 10);
		if (s.length == 1){
			switch (c) {
			case '-': return v - v2;
			case '+': return v + v2;
			default : return v * v2;
			}
		}
		else {
			char cc = expr.charAt(s[0].length());
			switch (c) {
			case '-': return evaluate(v - v2, cc, s[1]);
			case '+': return evaluate(v + v2, cc, s[1]);
			default : return evaluate(v * v2, cc, s[1]);
			}
		}
	}

}
