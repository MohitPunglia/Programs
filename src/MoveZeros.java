

public class MoveZeros {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 0, 0, 0, 1, 1, 0, 1 };
		int length = arr.length;
		int count = 0;

		for (int i = 0; i < length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}

		while (count < length)
			arr[count++] = 0;

		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
