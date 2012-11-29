public class OfficeParking {

	public int spacesUsed(String[] events) {
		int ppl = 0;
		int max = 0;
		for (String e : events)
			if (e.split(" ")[1].equals("arrives")){
				ppl++;
				if (max < ppl)
					max = ppl;
			}
			else
				ppl--;
		return max;
	}

}
