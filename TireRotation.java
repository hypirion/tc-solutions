public class TireRotation {

	public int getCycle(String initial, String current) {
		char[] c = initial.toCharArray();
		int rots = 1;
		for (int i = 0; i < 4; i++){
			if (new String(c).equals(current))
				return rots;
			rots++;
			char[] oc = new char[4];
			for (int j = 0; j < 4; j++)
				oc[j] = c[j];
			c[0] = oc[3];
			c[1] = oc[2];
			c[3] = oc[1];
			c[2] = oc[0];
		}
		return -1;
	}

}
