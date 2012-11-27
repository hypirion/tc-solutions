public class LCMRange {

	public int lcm(int first, int last) {
		int lcm = 1;
		for (int i = first; i <= last; i++)
			lcm =  lcm * (i / gcd(lcm, i));
		return lcm;
	}
	
	private static int gcd(int a, int b){
	    while (b > 0)
	    {
	        int t = b;
	        b = a % b;
	        a = t;
	    }
	    return a;
	}

}
