package baitapchuong2;

import java.util.Scanner;

public class bai6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i, n, gt=1;
		do {
			System.out.println("Nhap so nguyen n:");
			n = scanner.nextInt();
		}while(n<=0 || n>100);
		for(i=1;i<=n;i++) {
			gt = gt * i;
		}
		System.out.println("Giai thua cua " + n + " la:" +gt);
	}
}
