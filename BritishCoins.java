public class BritishCoins {

	public int[] coins(int pence) {
		int[] coins = new int[3];
		for (int i = 0; i < pence; i++){
			coins[2]++;
			coins[1] += coins[2]/12;
			coins[2] %= 12;
			coins[0] += coins[1]/20;
			coins[1] %= 20;
		}
		return coins;
	}

}
