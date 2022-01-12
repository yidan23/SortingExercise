public class SortingAlgorithms{
	private int[] array = {95,85,89,69,76,84,86,65,52,86,46,65,45,59,76,66,22,1,91,86,14,6,68,31,57,50,90,80,8,87,42,76,48,35,91,73,50,9,56,8,76,17,64,3,30,99,5,26,4,24,44,92,63,84,48,58,56,33,13,31,10,90,13,48,24,93,64,60,49,84,76,69,48,12,81,61,58,9,19,34,61,34,58,89,4,78,55,58,30,58,73,36,11,55,14,60,63,48,53,41 };
	
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
				arr[k-1] = temp;
				k--;
				swaps++;
			}
		}
		System.out.println("Insertion Sort Swaps: " + swaps);
	}
}
