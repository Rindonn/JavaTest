package com.exam.title1;

import java.util.Scanner;

public class print {
	static int[] a= {1,2,3,4,5,6,7,8,9,0};
	
	public static void aru(int n) {
		for(int i=0;i<10;i++) {
			if(a[i]==n) {
				System.out.print(i);
				System.exit(0);
			}
		}
		System.out.print("-1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		aru(n);
	}

}
