import java.util.ArrayList;
import java.util.Arrays;

public class ColorCode {

	public long getOhms(String[] code) {
		ArrayList<String> al = new ArrayList<String>(
				Arrays.asList(new String[]{"black", "brown", "red", "orange", "yellow",
										   "green", "blue", "violet", "grey", "white"}));
		long v = al.indexOf(code[0])*10 + al.indexOf(code[1]);
		for (int i = 0; i < al.indexOf(code[2]); i++)
			v *= 10;
		return v;
	}

}
