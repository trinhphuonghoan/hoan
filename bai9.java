package baitapchuong2;

import java.util.Scanner;

public class bai9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a;
		int dodai=0;
		System.out.println("Nhap chuoi ky tu:");
		a = scanner.nextLine();
		dodai = a.length();
		System.out.println("Do dai cua chuoi la: "+dodai);
	}
}
