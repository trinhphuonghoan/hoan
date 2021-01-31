package baitapchuong2;

import java.util.Scanner;

public class bai8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i, n, a[];
		float kq = 0, avg=0;
		System.out.println("Nhap so phan tu n:");
		n = scanner.nextInt();
		a = new int[n]; 
		for(i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu" + (i+1) + ":");
			a[i] = scanner.nextInt();
			kq += a[i];
			avg = kq/n;
		}
		System.out.println("Trung binh cong cua day so la: " +avg);
	}
}
