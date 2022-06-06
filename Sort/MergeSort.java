package sort;

public class MergeSort {
	public void merging(int arr[], int temp[], int low, int mid, int high) {
        int l1, l2, i;
 
        l1 = low;
        l2 = mid + 1;
        for (i = low; l1 <= mid && l2 <= high; i++) {
            if (arr[l1] <= arr[l2]) {
                temp[i] = arr[l1++];
            } else {
                temp[i] = arr[l2++];
            }
        }
 
        while (l1 <= mid) {
            temp[i++] = arr[l1++];
        }
        while (l2 <= high) {
            temp[i++] = arr[l2++];
        }
        for (i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
    }
 
    public void sort(int arr[], int temp[], int low, int high) {
        int mid;
 
        if (low < high) {
            mid = (low + high) / 2;
            sort(arr, temp, low, mid);
            sort(arr, temp, mid + 1, high);
            merging(arr, temp, low, mid, high);
            display(arr);
        } else {
            return;
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
        int temp[] = new int[10];
        MergeSort mS = new MergeSort();
        System.out.println("Mang du lieu dau vao: ");
        mS.display(arr);
        System.out.println("-----------------------------");
        mS.sort(arr, temp, 0, arr.length - 1);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        mS.display(arr);
    }
}
