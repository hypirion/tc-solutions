public class StringCompare {

	public int simpleDifference(String a, String b) {
		int sum = 0;
		char[] c = a.toCharArray(),
			   d = b.toCharArray();
		for (int i = 0; i < c.length && i < d.length; i++)
			if (c[i] == d[i])
				sum++;
		return sum;
	}

}
