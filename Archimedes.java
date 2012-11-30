public class Archimedes {

	public double approximatePi(int numSides) {
		double alpha = (180.0 - 360.0/numSides)/2.0;
		return Math.cos(Math.toRadians(alpha))*numSides;
	}

}
