package code;

public class average {
	
	public static double roundAverage(double[] array ) {
		double average = 0;
		for(int i = 0; i<array.length; i++) {
			average += array[i];
		}
		average = average / array.length;
		
		double min = Math.abs(array[0] - average);
		int minIndex = 0;
		for(int i =1; i< array.length; i++) {
			if(Math.abs(array[i] - average) < min) {
				min = Math.abs(array[i] - average);
				minIndex = i;
			}
		}
		return array[minIndex];
	}

}
