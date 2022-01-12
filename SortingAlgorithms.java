public class SortingAlgorithms{
	private int[] array = {10, 9, 8, 7 , 6, 5, 4, 3, 2, 1};
	
	public void bubbleSort(){
		int[] arr = new int[array.length];
		for(int x = 0; x<arr.length; x++){
			arr[x] = array[x];
		}
		
		int swaps = 0;
		int temp = 0;
		int counter = 10;
		while(counter!=0){
			counter = 0;
			for(int i = 0; i<arr.length-1;i++){
			if(arr[i] > arr[i+1]){
				temp = arr[i + 1];
				arr[i+1] = arr[i];
				arr[i] = temp;
				counter++;
				swaps++;
				}
			}
		}
		System.out.println("Bubble Sort Swaps: " + swaps);
	}
	
	
	public void selectionSort(){
		int[] arr = new int[array.length];
		for(int x = 0; x<arr.length; x++){
			arr[x] = array[x];
		}
		int swaps = 0;
		int min = 0;
		int temp = 0;
		for(int i = 0; i<arr.length-1; i++){
			min = i;
			for(int k=i; k<arr.length; k++){
				if(arr[k] < arr[min]){
					min=k;
				}
			}
			if(min!=i){
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
				swaps++;
			}
		}
		System.out.println("Selection Sort Swaps: " + swaps);
	}
	
	
	public void insertionSort(){
		int[] arr = new int[array.length];
		for(int x = 0; x<arr.length; x++){
			arr[x] = array[x];
		}
		int swaps = 0;
		int temp = 0;
		for(int i = 1; i<arr.length; i++){		
			temp = arr[i];
			int k = i;
			while(k> 0 && arr[k-1] > temp){
				arr[k] = arr[k-1];
				k--;
				swaps++;
			}
			arr[k] = temp;
		}
		System.out.println("Insertion Sort Swaps: " + swaps);
	}
}
