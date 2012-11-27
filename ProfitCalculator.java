public class ProfitCalculator {

	public int percent(String[] items) {
		int N = items.length;
		int sold = 0, cost = 0;
		for (int i = 0; i < N; i++){
			items[i] = items[i].replaceAll("[.]", "");
			sold += Integer.parseInt(items[i].substring(0, 5));
			cost += Integer.parseInt(items[i].substring(6));
		}
		
		return ((sold - cost)*100)/sold;
	}

}
