public class GreatFairyWar {

	public int minHP(int[] dps, int[] hp) {
		int N = dps.length;
		int dmg = 0;
		for (int i = 0; i < N; i++)
			for (int j = 0; j < hp[i]; j++)
				for (int k = i; k < N; k++)
					dmg += dps[k];
		return dmg;
	}

}
