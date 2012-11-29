public class Grader {

	public int[] grade(int[] predictedGrades, int[] actualGrades) {
		int N = predictedGrades.length;
		int[] diff = new int[7];
		for (int i = 0; i < N; i++)
			diff[Math.abs(predictedGrades[i]-actualGrades[i])]++;
		for (int i = 0; i < 7; i++)
			diff[i] = (diff[i]*100)/N;
		return diff;
	}

}
