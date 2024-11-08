public class MountainHeight {
	public static void main(String[] args) {
		int[] arr = {1020, 2700, 5000, 1005};
		int n = arr.length;
		int maxHeight = 0;

		for(int i = 0; i<n; i++) {
			if(arr[i] > maxHeight) {
				maxHeight = arr[i];
			}
		}
		System.out.println("Tallest mountain height "+maxHeight);
	}
}