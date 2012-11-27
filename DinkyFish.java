public class DinkyFish {

	public int monthsUntilCrowded(int tankVolume, int maleNum, int femaleNum) {
		int couples = Math.min(maleNum, femaleNum);
		int rem = (maleNum + femaleNum - 2 * couples);
		int months = -1;
		while ((couples + rem+1)/2 <= tankVolume){
			couples *= 2;
			months++;
		}
		return Math.max(0,months);
	}

}
