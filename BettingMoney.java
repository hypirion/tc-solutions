public class BettingMoney {

	public int moneyMade(int[] amounts, int[] centsPerDollar, int res) {
		int earnings = 0;
		for (int a : amounts)
			earnings += a*100;
		earnings -= amounts[res]*(100+centsPerDollar[res]);
		return earnings;
	}

}
