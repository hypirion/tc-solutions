public class InequalityChecker {

	public int[] getDifferences(int n) {
		int[] a = new int[2];
		int s = 0;
		for (int i = 1; i < n; i++)
			s += i*i*i;
		int S = s + n*n*n;
		a[0] = 2*(S+s) - n*n*n*n;
		a[1] = 4;
		int d = gcd(a[0], a[1]);
		a[0]/=d;
		a[1]/=d;
		return a;
	}
	
	private static int gcd(int a, int b){
	    while (b > 0) {
	        int t = b;
	        b = a % b;
	        a = t;
	    }
	    return a;
	}

}
