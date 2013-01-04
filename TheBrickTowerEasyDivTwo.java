import java.util.HashSet;

public class TheBrickTowerEasyDivTwo {

	public int find(int redCount, int redHeight, int blueCount, int blueHeight) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(redHeight);
		hs.add(blueHeight);
		int h = redHeight+blueHeight, rh = redCount-1, bh = blueCount-1;
		hs.add(h);
		while (true){
			h += redHeight;
			if (rh > 0)
				hs.add(h);
			else
				break;	
			rh--;
			h += blueHeight;
			if (bh > 0)
				hs.add(h);
			else
				break;
			bh--;
		}
		
		h = blueHeight + redHeight; rh = redCount-1; bh = blueCount-1;
		hs.add(h);
		while (true){
			h += blueHeight;
			if (bh > 0)
				hs.add(h);
			else
				break;
			bh--;
			h += redHeight;
			if (rh > 0)
				hs.add(h);
			else
				break;	
			rh--;
		}
		return hs.size();
	}

}
