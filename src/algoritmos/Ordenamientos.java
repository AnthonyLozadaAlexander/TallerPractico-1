package algoritmos;

import java.security.PublicKey;

public class Ordenamientos {
	
	
	private static <T> void intercambio(T[] arr, int i, int j) {
		T tempT = arr[i];
		arr[i] = arr[j];
		arr[j] = tempT;
	}

	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		int n = arr.length;
		boolean intercambio;
		
		for(int i = 0; i < n - 1; i++) {
			intercambio = false;
			for (int j = 0; j < n - i - 1; j++) {
				if(arr[j].compareTo(arr[j + 1]) > 0) {
					intercambio(arr, j, j +1);
					intercambio = true;
				}
			}
			
			if(!intercambio) {
				i = arr.length; // salimos del bucle
			}
			
		}
		
		
	}
	
	public static void bubbleSortR(int[] arr) {
		// bubbleSortR(arr, 0);
		
	}
}
