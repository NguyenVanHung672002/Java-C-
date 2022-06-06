package sort;

public class BubbleSort {
	 public void bubbleSort(int arr[]) {
	        int temp;
	        int i, j;
	 
	        boolean swapped = false;
	        for (i = 0; i < arr.length - 1; i++) {
	            swapped = false;
	          
	            for (j = 0; j < arr.length - 1 - i; j++) {
	                System.out.print("So sanh cac phan tu: [" + arr[j] + ", " + arr[j + 1] + "]");
	                if (arr[j] > arr[j + 1]) {
	                    temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	 
	                    swapped = true;
	                    System.out.println(" => trao doi [" + arr[j] + ", " + arr[j + 1] + "]");
	                } else {
	                    System.out.println(" => khong can trao doi.");
	                }
	             }
	            if (!swapped) {
	                break;
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
	        BubbleSort bS = new BubbleSort();
	        System.out.println("Mang du lieu dau vao: ");
	        bS.display(arr);
	        System.out.println("-----------------------------");
	        bS.bubbleSort(arr);
	        System.out.println("-----------------------------");
	        System.out.println("\nMang sau khi da sap xep: ");
	        bS.display(arr);
	    }
}
