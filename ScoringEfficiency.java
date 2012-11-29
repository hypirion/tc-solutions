import java.util.HashMap;

public class ScoringEfficiency {

	public double getPointsPerShot(String[] gameLog) {
		HashMap<String, Integer> fts = new HashMap<String, Integer>(){{
			put("Made 2 point field goal", 0); put("Missed 2 point field goal", 0);
			put("Made 3 point field goal", 0); put("Missed 3 point field goal", 0);
			put("Made free throw", 1);         put("Missed free throw", 1);
		}};
		HashMap<String, Integer> pts = new HashMap<String, Integer>(){{
			put("Made 2 point field goal", 2); put("Missed 2 point field goal", 0);
			put("Made 3 point field goal", 3); put("Missed 3 point field goal", 0);
			put("Made free throw", 1);         put("Missed free throw", 0);
		}};
		HashMap<String, Integer> fgs = new HashMap<String, Integer>(){{
			put("Made 2 point field goal", 1); put("Missed 2 point field goal", 1);
			put("Made 3 point field goal", 1); put("Missed 3 point field goal", 1);
			put("Made free throw", 0);         put("Missed free throw", 0);
		}};
		int tot = 0, fgoals = 0, fthrows = 0;
		for (String s : gameLog){
			tot += pts.get(s);
			fgoals += fgs.get(s);
			fthrows += fts.get(s);
		}
		return tot/(fgoals + 0.5*fthrows);
	}

}
