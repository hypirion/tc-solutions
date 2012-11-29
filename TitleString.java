public class TitleString {

	public String toFirstUpperCase(String title) {
		String n = "";
		boolean pspace = true;
		for (char c : title.toCharArray())
			if (c == ' '){
				pspace = true;
				n += c;
			}
			else if (c != ' '){
				if (pspace) {
					n += Character.toUpperCase(c);
					pspace = false;
				}
				else 
					n += c;
			}
		return n;
	}

}
