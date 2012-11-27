public class FixedPointTheorem {

	public double cycleRange(double R) {
		double x = 0.25;
		for (int i = 0; i < 2e6; i++){
			x = R*x*(1-x);
		}
		double max = 0, min = 1;
		for (int i = 0; i < 1000; i++){
			x = R*x*(1-x);
			if (max < x)
				max = x;
			if (x < min)
				min = x;
		}
		return max - min;
	}

}
