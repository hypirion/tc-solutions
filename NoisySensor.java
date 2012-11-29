import java.util.Arrays;

public class NoisySensor {

	public int[] medianFilter(int[] data) {
		int N = data.length;
		int[] ndata = new int[N];
		ndata[0] = data[0]; ndata[N-1] = data[N-1];
		for (int i = 1; i < N-1; i++){
			int[] aref = new int[3];
			for (int j = -1; j < 2; j++)
				aref[j+1] = data[i+j];
			Arrays.sort(aref);
			ndata[i] = aref[1];
		}
		return ndata;
	}

}
