import java.util.ArrayList;

public class BoxLoader {

	public int mostItems(int boxX, int boxY, int boxZ, int itemX, int itemY, int itemZ) {
		int[] box = {boxX, boxY, boxZ},
			  item = {itemX, itemY, itemZ};
		ArrayList<Integer> al = new ArrayList<Integer>(){{
			add(0); add(1); add(2);
		}};
		return rec(0, al, box, item);
	}
	
	public int rec(int dim, ArrayList<Integer> rm, int[] box, int[] item){
		if (dim == 3)
			return 1;
		int best = 0;
		for (int r : rm){
			int dimSpace = box[dim]/item[r];
			ArrayList<Integer> nrm = new ArrayList<Integer>(rm);
			nrm.remove(new Integer(r));
			best = Math.max(best, dimSpace*rec(dim+1, nrm, box, item));
		}
		return best;
	}

}
