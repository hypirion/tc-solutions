public class RPG {

	public int[] dieRolls(String[] dice) {
		double avg = 0;
		int min = 0, max = 0;
		for (String d : dice){
			String[] s = d.split("d", -1);
			int cnt = new Integer(s[0]);
			int size = new Integer(s[1]);
			max += cnt*size;
			min += cnt;
			avg += cnt*(size+1)/2.0;
		}
		int[] ret = {min, max, (int)avg};
		return ret;
	}

}
