public class Cards {

	public String[] deal(int numPlayers, String deck) {
		int N = deck.length();
		String[] ss = new String[numPlayers];
		for (int i = 0; i < numPlayers; i++)
			ss[i] = "";
		for (int i = 0; i < (N/numPlayers)*numPlayers; i++)
			ss[i%numPlayers] += deck.charAt(i);
		return ss;
	}

}
