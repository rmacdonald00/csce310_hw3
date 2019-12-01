package code;

public class MAinClass {
	
//	public static void main(String args[]) {
//		double[] arr1 = {1,2,60};
//		
//		double soln1 = average.roundAverage(arr1);
//		System.out.println("avg produces solution: " + soln1 + " with average distance : " + averageDistance.averageDistance(soln1, arr1));
//		double soln2 = shortestDist.shortestDistAlg(arr1);
//		System.out.println("algorithm produces solution: " + soln2 + " with average distance : " + averageDistance.averageDistance(soln2, arr1));
//	
//		
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i] + " with average distance : " + averageDistance.averageDistance(arr1[i], arr1));
//		}
//		
//	
//	double[] arr2 = {1, 40, 78, 122, 145, 167, 221};
//	
//	double soln21 = average.roundAverage(arr2);
//	System.out.println("avg produces solution: " + soln21 + " with average distance : " + averageDistance.averageDistance(soln21, arr2));
//	double soln22 = shortestDist.shortestDistAlg(arr2);
//	System.out.println("algorithm produces solution: " + soln22 + " with average distance : " + averageDistance.averageDistance(soln22, arr2));
//	
//	for(int i = 0; i < arr2.length; i++) {
//		System.out.println(arr2[i] + " with average distance : " + averageDistance.averageDistance(arr2[i], arr2));
//	}
//}
	
	public static void main(String args[]) {
		double[] arr = {1,2,3,4,5,6,6.1,6.2,500};
		double soln = arr[(int) Math.floor(arr.length / 2)];
		
		System.out.println("soln : " + soln + " with avg dists : " + averageDistance.averageDist(soln, arr));
		for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i] + " with average distance : " + averageDistance.averageDist(arr[i], arr));
	}
	}
}