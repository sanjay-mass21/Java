package TaskPrograms;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] arr= {10,40,60,56};
		 System.out.println("Original Array");
		 
		 for(int num : arr)
		 {
			 System.out.println(num+"");
		 }
		 
		 int n = arr.length;
	        for (int i = 0; i < n / 2; i++) {
	            int temp = arr[i];
	            arr[i] = arr[n - 1 - i];
	            arr[n - 1 - i] = temp;
	        }

	        System.out.println("\nReversed Array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	}

}
