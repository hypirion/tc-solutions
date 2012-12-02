import java.util.Arrays;

public class SequenceOfNumbers {

	public String[] rearrange(String[] sequence) {
		int N = sequence.length;
		long[] arr = new long[N];
		for (int i = 0; i < N; i++)
			arr[i] = Long.parseLong(sequence[i], 10);
		Arrays.sort(arr);
		for (int i = 0; i < N; i++)
			sequence[i] = String.valueOf(arr[i]);
		return sequence;
	}

}
