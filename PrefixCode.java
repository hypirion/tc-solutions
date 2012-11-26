public class PrefixCode {

	public String isOne(String[] w) {
		for (int i = 0; i < w.length; i++){
			for (int j = 0; j < w.length; j++){
				if (i != j && w[j].startsWith(w[i]))
					return String.format("No, %d", i);
			}
		}
		return "Yes";
	}

}
