import java.util.Arrays;

public class TriangleType {

	public String type(int a, int b, int c) {
		int[] arr = {a, b, c};
		Arrays.sort(arr);
		if (arr[0] + arr[1] <= arr[2])
			return "IMPOSSIBLE";
		for (int i = 0; i < 3; i++)
			arr[i] *= arr[i];
		if (arr[0]+arr[1] == arr[2])
			return "RIGHT";
		if (arr[0]+arr[1] < arr[2])
			return "OBTUSE";
		else
			return "ACUTE";
	}

}
