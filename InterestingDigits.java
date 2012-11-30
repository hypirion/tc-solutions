import java.util.ArrayList;

public class InterestingDigits {

	public int[] digits(int base) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int a = 2; a < base; a++){
			boolean interestingp = true;
			for (int b = a; interestingp && Integer.toString(b, base).length() < 4; b += a){
				char[] cc = Integer.toString(b, base).toCharArray();
				int sum = 0;
				for (char c : cc)
					if ('a' <= c && c <= 'z')
						sum += c - 'a' + 10;
					else
						sum += c - '0';
				if (sum % a != 0)
					interestingp = false;
			}
			if (interestingp)
				al.add(a);
		}
		int[] aref = new int[al.size()];
		for (int i = 0; i < al.size(); i++)
			aref[i] = al.get(i);
		return aref;
	}

}
