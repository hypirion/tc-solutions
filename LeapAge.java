public class LeapAge {

	public int getAge(int year, int born) {
		int leaps = 0;
		for (int i = born + 1; i <= year; i++)
			if (leapP(i))
				leaps++;
		return leaps;
	}
	
	public boolean leapP(int y){
		if (y % 4 == 0)
			if (y % 400 == 0)
				return true;
			else if (y % 100 == 0)
				return false;
			else return true;
		else return false;
	}

}
