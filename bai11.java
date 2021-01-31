package baitapchuong2;

import java.util.Scanner;

public class bai11 {
	int i,n,j,tg;
	Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so phan tu n:");
		n = scanner.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Nhap phan tu thu "+i+" :");
			a[i] = scanner.nextInt();
		}
		System.out.println("Mang sau khi nhap la: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					tg=a[i];
					a[i]=a[j];
					a[j]=tg;
				}
			}
		}
		System.out.println("\nMang sau khi sap xep la: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
}
