public class BinaryCode {

	public String[] decode(String message) {
		char[] Q = message.toCharArray();
		int N = Q.length;
		String[] ret = new String[2];
		for (int K = 0; K < 2; K++){
			char[] P = new char[N];
			P[0] = (char) ('0' + K);
			for (int i = 1; i < N; i++){
				char sum = Q[i-1];
				for (int j = -2; j < 0; j++)
					if (0 <= i+j)
						sum -= (P[i+j] - '0');
				P[i] = sum;
				if (sum != '0' & sum != '1') {
					ret[K] = "NONE";
					break;
				}
			}
			if (N > 1 && Q[N-1] == P[N-1] - '0' + P[N-2]){
				if (ret[K] == null)
					ret[K] = new String(P);
			}
			else if (N > 1 && Q[N-1] != P[N-1] - '0' + P[N-2]){
				ret[K] = "NONE";
			}
			else if (N == 1){
				if (Q[0] != P[0])
					ret[K] = "NONE";
				else
					ret[K] = ""+P[0];
			}
		}
		return ret;
	}

}
