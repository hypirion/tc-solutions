import java.util.Arrays;

public class FoxAndVacation {

	public int maxCities(int total, int[] d) {
		Arrays.sort(d);
		int amt = 0;
		for (int city : d){
			if (city <= total){
				amt++;
				total -= city;
			}
			else break;
		}
		return amt;
	}

}
