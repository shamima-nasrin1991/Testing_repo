package practice;

import java.util.Scanner;

public class Array_search {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a[]= {11,14,16,18,19,45,69};
		int i;
		System.out.println(" Enter value that to find ");
		int element = obj.nextInt();
		for(i=0;i<a.length;i++) {
			if(a[i]==element) {
				System.out.println(element+"is present index position:"+i);
			}
		}
		/*if(i==a.length) {
			System.out.println(element+"does not exist in an array");
		}
		*/
		// TODO Auto-generated method stub

	}

}
