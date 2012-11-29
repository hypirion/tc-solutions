public class BlackjackWinner {

	public int winnings(int bet, int dealer, int dealerBlackjack, int player, int blackjack) {
		if (player > 21)
			return -bet;
		if (dealer > 21 && player <= 21)
			return blackjack == 1 ? 3*bet/2 : bet;
		if (dealer > player)
			return -bet;
		if (player > dealer)
			return blackjack == 1 ? 3*bet/2 : bet;
		if (player == dealer)
			if (dealerBlackjack > blackjack)
				return -bet;
			else if (dealerBlackjack == blackjack)
				return 0;
			else return 3*bet/2;
		return 0;
	}

}
