package baitapchuong2;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String hovaten;
		int namsinh, tuoi;
		System.out.println("Nhap ho va ten:");
		hovaten = scanner.next();
		System.out.println("Nhap nam sinh:");
		namsinh = scanner.nextInt();
		tuoi = 2021 - namsinh;
		if(tuoi < 16) {
			System.out.println("Ban " + hovaten + " o do tuoi vi thanh nien");
		}else if (tuoi > 16 && tuoi <= 18 ) {
			System.out.println("Ban " + hovaten + " o do tuoi truong thanh");
		}else {
			System.out.println("Ban " + hovaten + " gia");
		}
	}
}
