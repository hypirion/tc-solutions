public class WarCry {

	public int alertTime(String outposts) {
		int N = outposts.length();
		char[] cc = outposts.toCharArray();
		for (int s = 0;;s++){
			boolean r = false;
			for (char c : cc)
				if (c == '-')
					r = true;
			if (!r)
				return s;
			char[] nc = new char[N];
			for (int i = 0; i < N; i++)
				nc[i] = cc[i];
			for (int i = 0; i < N; i++)
				if (cc[i] == '-')
					if (0 <= i-1 && cc[i-1] == 'x')
						nc[i] = 'x';
					else if (i+1 < N && cc[i+1] == 'x')
						nc[i] = 'x';
			for (int i = 0; i < N; i++)
				if (nc[i] == 'x')
					cc[i] = 'x';
		}
	}

}
