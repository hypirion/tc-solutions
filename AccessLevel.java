public class AccessLevel {

	public String canAccess(int[] rights, int minPermission) {
		String s = "";
		for (int r : rights)
			s += (r < minPermission) ? "D" : "A";
		return s;
	}

}
