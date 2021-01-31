package baitapchuong2;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		float a, b, tong, hieu, tich, thuong;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so a:");
		a = scanner.nextFloat();
		System.out.println("Nhap so b:");
		b = scanner.nextFloat();
		tong = a + b;
		System.out.println("Tong 2 so la:" + tong);
		hieu = a - b;
		System.out.println("Hieu 2 so la:" + hieu);
		tich = a * b;
		System.out.println("Tich 2 so la:" + tich);
		thuong = a / b;
		System.out.println("Thuong 2 so la:" + thuong);
		if(a > b) {
			System.out.println("So lon hon la:" + a);
		}else {
			System.out.println("So lon hon la:" + b);
		}
	}
}
