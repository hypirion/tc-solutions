public class CardCount {

	public String[] dealHands(int numPlayers, String deck) {
		String[] ps = new String[numPlayers];
		for (int i = 0; i < numPlayers; i++)
			ps[i] = "";
		char[] cc = deck.toCharArray();
		int N = deck.length();
		int iter = 0;
		for (int i = 0; i < (N/numPlayers)*numPlayers; i++){
			ps[iter++] += cc[i];
			iter %= numPlayers;
		}
		return ps;
	}

}
