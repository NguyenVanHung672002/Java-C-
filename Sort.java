package Btap_Array;

import java.util.Scanner;

public class Sort {
	public static void Array(int arr[], int n) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<n;i++) {
			System.out.print("arr["+i+"]=");
			arr[i]= sc.nextInt();
		}
	}
	public static void bubbleSortASC(int arr[], int n) {
		 int temp = arr[0];
	        for (int i = 0 ; i < n- 1; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] > arr[j]) {
	                    temp = arr[j];
	                    arr[j] = arr[i];
	                    arr[i] = temp;
	                }
	            }
	        }
	}
	public static void bubbleSortDCR(int arr[], int n) {
		int temp= arr[0];
			for(int i=0;i<n-1;i++) {
				for(int j=i+1;j<n;j++) {
					if(arr[i]<arr[j]) {
						temp= arr[j];
						arr[j]= arr[i];
						arr[i]=temp;
					}
				}
			}
	}
	 public static int [] insert(int [] arr, int k) {
	        int arrIndex = arr.length - 1;
	        int tempIndex = arr.length;
	        int [] tempArr = new int [tempIndex + 1];
	        boolean inserted = false;
	         
	        for (int i = tempIndex; i >= 0; i--) {
	            if (arrIndex > -1 && arr[arrIndex] > k) {
	                tempArr[i] = arr[arrIndex--];
	            } else {
	                if (!inserted) {
	                    tempArr[i] = k;
	                    inserted = true;
	                } else {
	                    tempArr[i] = arr[arrIndex--];
	                }
	            }
	        }
	        return tempArr;
	    }
	 public static void selectionSort(int arr[], int n) {
		 for(int i=0;i<n;i++) {
			 int min=i;
			 for(int j=i+1;j<n;j++) {
				 if(arr[j]<arr[min]) {
					 min=j;
				 }
			 }if(min!=i) {
				 int temp= arr[i];
				 arr[i]=arr[min];
				 arr[min]= temp;
			 }
		 }
	 }
	public static void outPut(int arr[], int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap so phan tu cua mang ");
		int n,k;
		int arr[];
		n= sc.nextInt();
		System.out.println("nhap phan tu muon chen");
		k= sc.nextInt();
		arr= new int[n];
		Array(arr,n);
		System.out.println("xap xep tang dan: ");
		bubbleSortASC(arr,n);
		outPut(arr,n);
		System.out.println();
		System.out.println("xep xep giam dan: ");
		bubbleSortDCR(arr, n);
		outPut(arr, n);
		System.out.println();
		System.out.println("mang sau khi chen");
		insert(arr,k);
		outPut(arr,n);
	}
}
