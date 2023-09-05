package lec_11;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int[] arr = { 5, 3, 4, 2, 1 };
				Sort(arr);
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
			}

			public static void Sort(int[] arr) {
				for (int i = 0; i < arr.length; i++) {
					int min = i; // index
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[min] > arr[j]) {
							min = j;
						}
					}
					int temp = arr[i];
					arr[i] = arr[min];
					arr[min] = temp;
				}
			}
		
	}


