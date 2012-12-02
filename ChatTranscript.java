public class ChatTranscript {

	public int howMany(String[] transcript, String name) {
		int s = 0;
		for (String ss : transcript)
			if (ss.startsWith(name+":"))
				s++;
		return s;
	}

}
