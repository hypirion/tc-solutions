public class ArrayHash {

	public int getHash(String[] input) {
		int hash = 0;
		for (int i = 0; i < input.length; i++){
			char cc[] = input[i].toCharArray();
			for (int j = 0; j < cc.length; j++)
				hash += cc[j] - 'A' + i + j;
		}
		return hash;
	}

}
