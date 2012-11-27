import java.util.Arrays;

public class SkipRope {

	public int[] partners(int[] candidates, int height) {
		int b1 = Integer.MIN_VALUE, b2 = Integer.MIN_VALUE;
		for (int c : candidates){
			if (Math.abs(c - height) < Math.abs(b1 - height)){
				b2 = b1;
				b1 = c;
			}
			else if (Math.abs(c - height) == Math.abs(b1 - height)) {
				if (b1 <= c){
					b2 = b1;
					b1 = c;
				}
				else if (c < b1){
					if (Math.abs(c - height) < Math.abs(b2 - height)){
						b2 = c;
					}
					else if (Math.abs(c - height) == Math.abs(b2 - height)) {
						if (b2 < c){
							b2 = c;
						}
					}
				}
			}
			else if (Math.abs(c - height) < Math.abs(b2 - height)){
				b2 = c;
			}
			else if (Math.abs(c - height) == Math.abs(b2 - height)) {
				if (b2 < c){
					b2 = c;
				}
			}
		}
		int[] a = new int[]{b1, b2};
		Arrays.sort(a);
		return a; 
	}

}
