public class RGBColor {

	public int[] getComplement(int[] rgb) {
		boolean alt = true;
		for (int i = 0; i < 3; i++){
			int comp = 0xff - rgb[i];
			if (32 < Math.abs(comp-rgb[i]))
				alt = false;
		}
		if (alt)
			for (int i = 0; i < 3; i++)
				rgb[i] = (rgb[i]+128)%256;
		else
			for (int i = 0; i < 3; i++)
				rgb[i] = 0xff - rgb[i];
		return rgb;
	}

}
