public class CutoffRounder {

	public int round(String num, String cutoff) {
		double dum = Double.parseDouble(num),
			   cut = Double.parseDouble(cutoff);
		if (dum % 1 > cut)
			return (int)(dum+1);
		else
			return (int) dum;
	}

}
