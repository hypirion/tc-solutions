import java.util.HashMap;

public class GolfScore {

	public int tally(int[] parValues, String[] scoreSheet) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>(){{
			put("triple bogey", 3);
			put("double bogey", 2);
		    put("bogey", 1);
		    put("par", 0);
		    put("birdie", -1);
		    put("eagle", -2);
		    put("albatross", -3);
		    put("hole in one", 0);
		}};
		int sum = 0;
		for (int p : parValues)
			sum += p;
		for (String s : scoreSheet)
			sum += hm.get(s);
		for (int i = 0; i < parValues.length; i++)
			if (scoreSheet[i].equals("hole in one"))
				sum -= parValues[i]-1;
		return sum;
	}

}
