public class Reminder {
	public static void main(String[] args) {
		int[] a = {2, 3, 3, 4, 4, 5};
		int n = a.length;

		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				int rem = a[i] % a[j];
				System.out.println(a[i] +" % "+ a[j] +" = "+ rem);
			}
		}
	}
}