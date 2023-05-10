/**
 * 
 * 
 * @author Mukesh Topic: Binary Search TC: O(Log N) Binary Seach we can use in
 *         below conditions 1. Array is sorted 2. Array is decreasing and
 *         increase pattern 3. Array is sorted and rotated 4. Array is zigzag
 *         format
 *
 */
public class binarySearchAlgo_04 {
	public static void main(String[] args) {
		int[] array = { 2, 3, 4, 5, 6, 7, 8, 9 };
		int index = binarySearch(array, 4, 0, 7);
		System.out.println("Index of the array is.." + index);
	}

	public static int binarySearch(int[] array, int key, int low, int high) {
		if (low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (array[mid] == key) {
			return mid;
		} else if (array[mid] > key) {
			return binarySearch(array, key, low, mid - 1);
		} else {
			return binarySearch(array, key, mid + 1, high);
		}
	}
}
