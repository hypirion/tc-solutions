public class MostProfitable {

	public String bestItem(int[] costs, int[] prices, int[] sales, String[] items) {
		int N = costs.length;
		int best = 0;
		String b = "";
		for (int i = 0; i < N; i++){
			int made = (prices[i]-costs[i])*sales[i];
			if (best < made){
				best = made;
				b = items[i];
			}
		}
		return b;
	}

}
