package com.Logicalsatments;

import java.util.Scanner;

public class Foodorderswitch {

	public static void main(String[] args) {
		String yn = "";
		int qu;
		int grtotal = 0;
		int pzprice;
		int brprice;
		int bgprice;
		int ndprice;
		int totalndprice = 0;
		int totalbrprice = 0;
		int totalpzprice = 0;
		int totalbgprice = 0;
		do {
			System.out.println("Enter want You Want:");
			System.out.println("1)Pizza");
			System.out.println("2)Burger");
			System.out.println("3)Biryani");
			System.out.println("4)Noodles");
			Scanner sc = new Scanner(System.in);
			int mn = sc.nextInt();
			switch (mn) {
			case 1 -> {
				System.out.println("Pizzer per one is:" + "200");
				pzprice = 200;
				System.out.println("how mach quantity you want:");
				qu = sc.nextInt();
				totalpzprice = pzprice * qu;
				break;

			}
			case 2 -> {
				System.out.println("Burger per one is:" + "120");
				bgprice = 120;
				System.out.println("how mach quantity you want:");
				int qubr = sc.nextInt();
				totalbgprice = bgprice * qubr;
				break;
			}
			case 3 -> {
				System.out.println("Biryani per one is:" + "180");
				brprice = 180;
				System.out.println("how mach quantity you want:");
				int qubr = sc.nextInt();
				totalbrprice = brprice * qubr;
				break;
			}
			case 4 -> {
				System.out.println("Noodles per one is:" + "100");
				ndprice = 100;
				System.out.println("how mach quantity you want:");
				int qund = sc.nextInt();
				totalndprice = ndprice * qund;
				break;
			}
			default -> {
				System.out.println("Enter Item Not Available");
			}

			}
			System.out.println("Do you Want continue y yes and n no:");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));

		grtotal = totalndprice + totalbrprice + totalbgprice + totalpzprice;
		System.out.println("Total pizza price:" + totalpzprice);
		
		System.out.println("Total Burgar price:" + totalbgprice);
		System.out.println("Total Biyrani price:" + totalbrprice);
		System.out.println("Total Noodles price:" + totalndprice);
		System.out.println("Total price:" + grtotal);
	}

}
