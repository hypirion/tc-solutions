public class ClockWalk {

	public int finalPosition(String flips) {
		char[] cc = flips.toCharArray();
		int pos = 0;
		for (int i = 0; i < cc.length; i++)
			if (cc[i] == 'h')
				pos += i+1;
			else
				pos -= i+1;
		pos = ((pos%12)+12)%12;
		if (pos == 0)
			return 12;
		else
			return pos;
	}

}
