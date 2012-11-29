public class MassiveNumbers {

	public String getLargest(String numberA, String numberB) {
		String[] a = numberA.split("\\^"),
				b = numberB.split("\\^");
		double aa = Integer.parseInt(a[1])*Math.log(Integer.parseInt(a[0]));
		double bb = Integer.parseInt(b[1])*Math.log(Integer.parseInt(b[0]));
		return (aa > bb) ? numberA : numberB;
	}

}

