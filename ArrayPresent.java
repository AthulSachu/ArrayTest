public class ArrayPresent {
	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 5, 6};
		int n = arr.length;
		int x = 4;

		for(int i = 0; i<n; i++) {
			if(arr[i] == x) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}	
}