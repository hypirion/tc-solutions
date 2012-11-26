public class Time {

	public String whatTime(int seconds) {
		return String.format("%d:%d:%d", (seconds / (60*60)), 
				(seconds/60) % 60, seconds % 60);
	}

}
