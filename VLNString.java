public class VLNString {

	public String makeAcronym(String longName) {
		String res = "";
		for (String s : longName.split(" "))
			if (!(s.equals("") || s.equals("the") || s.equals("and") || s.equals("of")))
				res += Character.toUpperCase(s.charAt(0));
		return res;
	}

}
