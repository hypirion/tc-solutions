public class WaiterTipping {

	public int maxPercent(int total, int taxPercent, int money) {
		int toPay = total + (total*taxPercent)/100;
		int tip = 0;
		while (toPay + (total*tip)/100 <= money)
			tip++;
		tip--;
		return tip;
	}

}
