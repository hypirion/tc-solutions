public class FormatAmt {

	public String amount(int dollars, int cents) {
		return String.format("$%,d.%02d", dollars, cents);
	}

}
