package communityuni.com.model;

import java.util.Scanner;

public class Bai9 {
	public static boolean isPremaNumber(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static int Fibonaci(int n) {
		if(n<0)
			return -1;
		else if(n==0|| n==1) {
			return n;
		}
		else return Fibonaci(n-1)+Fibonaci(n-2);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n =sc.nextInt(); 
		int i=0;
		while(Fibonaci(i)<100) {
	
			if(isPremaNumber(Fibonaci(i))) {
				System.out.print(Fibonaci(i)+ ",");
			}
			i++;
		}
		
	}
}
