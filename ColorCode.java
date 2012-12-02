import java.util.HashMap;

public class ColorCode {

	public long getOhms(String[] code) {
		HashMap<String, Integer> val = new HashMap<String, Integer>(){{
			put("black", 0);
			put("brown", 1);
			put("red"  , 2);
			put("orange", 3);
			put("yellow", 4);
			put("green" , 5);
			put("blue"  , 6);
			put("violet", 7);
			put("grey"  , 8);
			put("white" , 9);
		}};
		long v = val.get(code[0])*10 + val.get(code[1]);
		for (int i = 0; i < val.get(code[2]); i++)
			v *= 10;
		return v;
	}

}
