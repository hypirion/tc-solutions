public class EyeDrops {

	public double closest(int sleepTime, int k) {
		double delta = 24.0/k;
		if (delta > sleepTime)
			return delta*60;
		else
			return ((24.0 - sleepTime) * 60)/(k-1);
	}

}
