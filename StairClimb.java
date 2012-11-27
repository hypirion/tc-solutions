public class StairClimb {

	public int stridesTaken(int[] flights, int stairsPerStride) {
		int sum = 0;
		for (int f : flights)
			for (int i = 0; i < f; i+=stairsPerStride)
				sum++;
		return sum + (flights.length-1)*2;
	}

}
