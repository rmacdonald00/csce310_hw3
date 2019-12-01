package code;

public class shortestDist {

	public static double shortestDistAlg(double[] arr) {
		double[] dists = new double[arr.length];
		for(int i = 0; i<arr.length; i++) {
			double value = 0;
			for(int j = 0; j<arr.length; j++) {
				if(j<i) {
					value -= arr[j];
				}else {
					value += arr[j];
				}
			}
			value = value / arr.length;
			dists[i] = value;
		}
		double min = Math.abs(arr[0] - dists[1]);
		int minIndex = 0;
		for(int i = 1; i<arr.length; i++) {
			if(Math.abs(arr[i] - dists[i]) < min) {
				min = Math.abs(arr[i] - dists[i]);
				minIndex = i;
		}
 	}
		return arr[minIndex];
	}
}
