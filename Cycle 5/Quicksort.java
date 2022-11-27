import java.util.Scanner;

public class QuickSort {

	public static void quickSort(int a[], int l, int r) {
		if(l < r) {
			int pivot = partition(a, l, r);
			quickSort(a, l, pivot - 1);
			quickSort(a, pivot + 1, r);	
		}	
	}
	
	public static int partition(int a[], int l, int r) {
		int pivot = a[r];
		int i = l - 1;
		for(int j = l; j <= r; j++) {
			if(a[j] < pivot) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i+1];
		a[i+1] = a[r];
		a[r] = temp;
		return (i+1);
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] a = new int[size];

		System.out.println("Enter the elements: ");
		for(int i = 0; i < size; i++)
			a[i] = scanner.nextInt();

		quickSort(a, 0, a.length - 1);

		for(int i = 0; i < size; i++)
			System.out.print(a[i] + " ");
		System.out.println();

	}
}
