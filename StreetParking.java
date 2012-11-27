public class StreetParking {

	public int freeParks(String street) {
		char[] a = street.toCharArray();
		int N = a.length, c = 0;
		for (int i = 0; i < N; i++){
			boolean cp = true;
			if (a[i] != '-') 
				cp = false;
			for (int j = 1; j < 3 && i+j < N; j++)
				if (a[i+j] == 'B')
					cp = false;
			if (i+1 < N && a[i+1] == 'S')
				cp = false;
			if (i-1 != -1 && a[i-1] == 'S')
				cp = false;
			if (cp)
				c++;
		}
		return c;
	}

}
