public class PassingGrade {

	public int pointsNeeded(int[] pointsEarned, int[] pointsPossible, int finalExam) {
		int earned = 0, total = 0, N = pointsEarned.length;
		for (int i = 0; i < N;
				earned += pointsEarned[i], total += pointsPossible[i], i++);
		total += finalExam;
		for (int i = 0; i <= finalExam; i++)
			if ((earned+i)*100 >= 65*total)
				return i;
		return -1;
	}

}
