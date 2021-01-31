package baitapchuong2;

import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		int n;
		int tong = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so nguyen:");
			
		while(true) {
			n = scanner.nextInt();
			tong = tong + n;
			if(tong>100) {
				break;
			}
		}
		System.out.println("Tong la:" + tong);
	}
}
