import java.util.ArrayList;

public class PeopleCircle {

	public String order(int numMales, int numFemales, int K) {
		if (numMales == 0){
			String s = "";
			while (s.length() < numFemales)
				s += "F";
			return s;
		}
		ArrayList<Character> seq = new ArrayList<Character>();
		while (seq.size() < numMales)
			seq.add('M');
		int pos = 0;
		for (int f = 0; f < numFemales; f++) {
			seq.add(pos, 'F');
			int ss = seq.size();
			pos -= K-1;
			pos = ((pos%ss)+ss)%ss;
		}
		while (pos --> 0)
			seq.add(seq.remove(0));
		String s = "";
		for (char c : seq)
			s += c;
		return s;
	}

}
