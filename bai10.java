package baitapchuong2;

import java.util.Scanner;

public class bai10 {
	public static void main(String[] agrs) {
		String a,b;
		int i,dem=0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhap vao 1 chuoi ky tu:");
			a = scanner.nextLine();
		}while(a.length()>= 80);
		do {
			System.out.println("Nhap 1 ky tu bat ky:");
			b = scanner.nextLine();
		}while(b.length()> 1);
		
		for(i=0; i < a.length(); i++)
		{
			if(b.charAt(0) == a.charAt(i))
			{
				dem++;
			}
		}
		System.out.print("So lan xua hien cua ky tu "+b.charAt(0)+" la: "+dem);
		
	}
}
