public class ImageDithering {

	public int count(String dithered, String[] screen) {
		int sum = 0;
		for (char c : dithered.toCharArray())
			for (String s : screen)
				for (char cc : s.toCharArray())
					if (cc == c)
						sum++;
		return sum;
	}

}
