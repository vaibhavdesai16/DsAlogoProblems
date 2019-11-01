package com.consecutive_integer;

public class FindConsecutive {
	
	/**
	 * @param arr    - array list of an integers
	 * @param length
	 * @return max number consecutive positioned elements which can arranged as
	 *         consecutive integers
	 */
	public int getMaxConsecutive(int[] arr, int length) {

		int maxConsecutive = 0;
		int windowLength = 1;
		/*
		 * go till last element and keep increasing window size
		 */
		while (windowLength <= length) {

			for (int i = 0; i <= (length - windowLength); i++) {
				int[] window = getConsecutiveIntWindow(arr, length, i, windowLength);
				if (sortAndFind(window)) {
					maxConsecutive = windowLength;
				}
			}
			windowLength++;
		}
		return maxConsecutive;
	}

	/**
	 * method will return window of elements from given array
	 * 
	 * @param arr
	 * @param length
	 * @param window_length
	 * @return
	 */
	public int[] getConsecutiveIntWindow(int[] arr, int length, int start_index, int window_length) {

		int[] window = new int[window_length];
		int window_index = 0;

		for (int j = start_index; j < (start_index + window_length); j++) {
			if (j < length) {
				window[window_index] = arr[j];
				window_index++;
			}
		}
		return window;
	}

	/**
	 * method will return whether given array can be Arranged as consecutive
	 * integers
	 * 
	 * @param int_window
	 * @return
	 */
	public boolean sortAndFind(int[] int_window) {
		int[] sorted_window = int_window;
		boolean isConsecutive = true;

		// bubble sort
		for (int i = 0; i < sorted_window.length; i++) {
			for (int j = 0; j < sorted_window.length - 1; j++) {

				if (sorted_window[j] > sorted_window[j + 1]) {
					int temp = sorted_window[j];
					sorted_window[j] = sorted_window[j + 1];
					sorted_window[j + 1] = temp;
				}
			}
		}

		// check if sorted array is consecutive
		for (int i = 0; i < (int_window.length - 1); i++) {
			if ((int_window[i + 1] - int_window[i] != 1)) {
				isConsecutive = false;
				break;
			}
		}

		return isConsecutive;
	}

}
