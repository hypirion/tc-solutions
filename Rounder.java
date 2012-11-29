public class Rounder {

	public int round(int n, int b) {
		int rem = n % b;
		if (rem < (b+1)/2)
			return n - rem;
		else
			return n + b - rem;
	}

}
