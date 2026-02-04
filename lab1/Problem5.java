package lab1;

public class Problem5 {

	public static int getMiddle(int[] values) {
		return values[values.length / 2];
	}

	public static double getAverage(int[] values) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		return (double) sum / values.length;
	}

	public static int getNegativeTotal(int[] values) {
		int total = 0;
		for (int value : values) {
			if (value < 0) {
				total += value;
			}
		}
		return total;
	}

	public static boolean isMoreNegative(int[] values) {
		int negatives = 0;
		int positives = 0;

		for (int value : values) {
			if (value < 0) {
				negatives++;
			} else if (value > 0) {
				positives++;
			}
		}

		return negatives > positives;
	}

	public static void main(String[] args) {
		int[] array1 = { 3, -2, 5, -7, 4 };
		int[] array2 = { -1, -4, -6, 2, 9, 0 };

		System.out.println("array1 middle: " + getMiddle(array1));
		System.out.println("array1 average: " + getAverage(array1));
		System.out.println("array1 negative total: " + getNegativeTotal(array1));
		System.out.println("array1 more negatives than positives: " + isMoreNegative(array1));

		System.out.println("array2 middle: " + getMiddle(array2));
		System.out.println("array2 average: " + getAverage(array2));
		System.out.println("array2 negative total: " + getNegativeTotal(array2));
		System.out.println("array2 more negatives than positives: " + isMoreNegative(array2));
	}
}
