public class StringMult {

	public String times(String sFactor, int iFactor) {
		char[] cc = sFactor.toCharArray();
		String v = "";
		if (iFactor > 0)
			for (int i = 0; i < iFactor; i++)
				v += sFactor;
		else
			for (int i = 0; i < -iFactor; i++)
				for (int j = cc.length - 1; 0 <= j; j--)
					v += cc[j];
		return v;
	}

}
