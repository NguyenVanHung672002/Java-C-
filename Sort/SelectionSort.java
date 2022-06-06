package sort;

public class SelectionSort {
	  public void selectionSort(int arr[]) {
	        int indexMin, i, j;
	 
	      
	        for (i = 0; i < arr.length - 1; i++) {
	            
	            indexMin = i;
	            for (j = i + 1; j < arr.length; j++) {
	                if (arr[j] < arr[indexMin]) {
	                    indexMin = j;
	                }
	            }
	 
	            if (indexMin != i) {
	                System.out.println(" ==> Trao doi phan tu: [" + arr[i] 
	                        + ", " + arr[indexMin] + "]");
	                
	                int temp = arr[indexMin];
	                arr[indexMin] = arr[i];
	                arr[i] = temp;
	            }
	 
	            System.out.println("Vong lap thu " + (i + 1));
	            display(arr);
	        }
	    }
	 
	    public void display(int arr[]) {
	        int i;
	        System.out.print("[");
	        for (i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	 
	        System.out.print("]\n");
	    }
	 
	    public static void main(String[] args) {
	       
	        int arr[] = { 6, 7, 0, 2, 8, 1, 3, 9, 4, 5 };
	 
	        SelectionSort sS = new SelectionSort();
	        System.out.println("Mang du lieu dau vao: ");
	        sS.display(arr);
	        System.out.println("-----------------------------");
	        sS.selectionSort(arr);
	        System.out.println("-----------------------------");
	        System.out.println("\nMang sau khi da sap xep: ");
	        sS.display(arr);
	    }
}
