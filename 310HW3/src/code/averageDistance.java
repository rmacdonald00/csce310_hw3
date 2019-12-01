package code;

public class averageDistance {

	public static double averageDist(double soln, double[]arr) {
		double total = 0;
		for(int i =0; i<arr.length; i++) {
		//	System.out.println("added dist: " + Math.abs(arr[i] - soln));
			total += Math.abs(arr[i] - soln);
		}
	//	System.out.println(total);
		return total / arr.length;
	} 
	
	
}
