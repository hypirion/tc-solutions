public class TextCompressor {

	public String longestRepeat(String sourceText) {
		int N = sourceText.length(), bestl = 0, begin = 100;
		String best = "";
		for (int i = N; 0 <= i; i--){
			for (int j = 0; j <= i; j++){
				String hit = sourceText.substring(j,i),
					   r = sourceText.substring(i);
				if (r.contains(hit) && bestl <= hit.length()){
					if (bestl != hit.length() || j < begin){
						begin = j;
						bestl = hit.length();
						best = hit;
					}
				}
			}
		}
		return best;
	}

}
