import java.util.Arrays;
import java.util.LinkedList;

public class CircleGame {

	public int cardsLeft(String deck) {
		String lookup = "-A23456789TJQK";
		LinkedList<Character> ll = new LinkedList<Character>();
		for (char c : deck.toCharArray())
			ll.add(c);
		int pos = 0;
		for (int i = 0; i < 1000 && ll.size() > 0; i++){
			int npos = (pos + 1)%ll.size();
			if (ll.get(pos) == 'K'){
				ll.remove(pos);
				continue;
			}
			int[] vs = new int[2];
			vs[0] = pos; vs[1] = npos;
			Arrays.sort(vs);
			int sum = 0;
			for (int v : vs)
				sum += lookup.indexOf(ll.get(v));
			if (sum == 13){
				ll.remove(vs[1]);
				ll.remove(vs[0]);
				if (ll.size() != 0)
					pos = vs[0] % ll.size();
			}
			else 
				pos = npos;
		}
		return ll.size();
	}

}