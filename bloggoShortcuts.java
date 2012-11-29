public class bloggoShortcuts {

	public String expand(String text) {
		return text.replaceAll("[*](.*?)[*]", "<b>$1</b>")
				   .replaceAll("[_](.*?)[_]", "<i>$1</i>");
	}

}
