public class SpreadsheetColumn {

	public String getLabel(int column) {
		column--;
		String s = "" + ((char)(column%26+'A'));
		if (column >= 26)
			s = (char)(column/26 + 'A'-1) + s;
		return s;
	}

}
