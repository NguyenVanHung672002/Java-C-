 package communityuni.com.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai7 {
	public static List<Integer> chiaNhoSo(int n){
		List<Integer> listNumber= new ArrayList<Integer>();
		int i=2;
		while(n>1) {
			if(n%i==0) {
				n/=i;
				listNumber.add(i);
			}
			else {
				i++; 
			}
		}
		listNumber.isEmpty();
		listNumber.add(n);
		return listNumber;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n; 
		n =sc.nextInt();
		List<Integer> listNumber= chiaNhoSo(n);
		
		for(int i=0;i<listNumber.size();i++) {
			System.out.print(listNumber.get(i)+"x");
			
		}
		System.out.println(listNumber.get(listNumber.size()-1));
		
	}
}
