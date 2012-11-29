public class Bits {

	public int minBits(int n) {
		int c;
		for (c = 0;n>0;c++,n>>=1);
		return c;
	}

}
