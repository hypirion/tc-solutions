public class ProgressBar {

	public String showProgress(int[] taskTimes, int tasksCompleted) {
		int t = 0;
		for (int i = 0; i < tasksCompleted; i++)
			t += taskTimes[i];
		int sum = 0;
		for (int tt : taskTimes)
			sum += tt;
		int pounds = (t*20)/sum;
		String s = "";
		while (pounds --> 0)
			s += "#";
		while (s.length() < 20)
			s += ".";
		return s;
	}

}
