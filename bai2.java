package baitapchuong2;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so a:");
		a = scanner.nextInt();
		if(a%2==0) {
			System.out.println(a + " la so chan");
		}else {
			System.out.println(a + " la so le");
		}
	}
}
