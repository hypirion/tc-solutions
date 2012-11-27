public class Quipu {

	public int readKnots(String knots) {
		String[] its = knots.split("-", -1);
		int val = 0;
		for (String i : its)
			val = val * 10 + i.length();
		return val/10;
	}

}
