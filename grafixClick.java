import java.util.ArrayList;

public class grafixClick {

	public int[] checkSaveButton(int[] mouseRows, int[] mouseCols) {
		int N = mouseCols.length;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < N; i++)
			if (20 <= mouseRows[i] && mouseRows[i] <= 39 &&
				50 <= mouseCols[i] && mouseCols[i] <= 99)
				al.add(i);
		int[] arr = new int[al.size()];
		for (int i = 0; i < arr.length; i++)
			arr[i] = al.get(i);
		return arr;
	}

}
