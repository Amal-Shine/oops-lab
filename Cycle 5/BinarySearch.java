import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int a[], int x, int l, int r) {

		if(!(l <= r))
			return -1;
		int m = (l+r)/2;
		if(a[m] == x)
			return m;
		else if(x < a[m])
			return binarySearch(a, x, l, m);
		else if(x > a[m])
			return binarySearch(a, x, m, r);
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] a = new int[size];

		System.out.println("Enter the elements: ");
		for(int i = 0; i < size; i++)
			a[i] = scanner.nextInt();

		System.out.println("Enter value to search for: ");
		int x = scanner.nextInt();

		for(int i = 0; i < size; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		int foundAt = binarySearch(a, x, 0, size-1);

		if(foundAt == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at " + foundAt);

	}
}
