public class MagicSquare {

	public int missing(int[] square) {
		int origSum = 0;
		top: 
		do {
			for (int ofst = 0; ofst < 3; ofst++){
				if (origSum != 0)
					break top;
				for (int i = 0; i < 3; i++){
					if (square[i+ofst*3] == -1){
						origSum = 0;
						break;
					}
					origSum+=square[i+ofst*3];
				}
				if (origSum != 0)
					break top;
				for (int i = 0; i < 3; i++){
					if (square[i*3+ofst] == -1){
						origSum = 0;
						break;
					}
					origSum+=square[i*3+ofst];
				}
			}
		} while (false);
		int ipos = 0;
		for (int i = 0; i < 9; i++)
			if (square[i] == -1)
				ipos = i;
		int ofst = ipos / 3;
		int sum = 1;
		for (int i = 0; i < 3; i++)
			sum += square[ofst*3+i];
		return origSum - sum;
	}

}
