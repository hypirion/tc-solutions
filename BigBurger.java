import java.util.LinkedList;

public class BigBurger {

	public int maxWait(int[] arrival, int[] service) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		int time = 0, N = service.length;
		int maxWait = 0;
		for (int ai = 0; ai < N; ai++) {
			ll.addLast(ai);
			int i = ll.removeFirst();
			maxWait = Math.max(time - arrival[i], maxWait);
			if (time <= arrival[i])
				time = arrival[i];
			time += service[i];
		}
		return maxWait;
	}

}
