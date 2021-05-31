package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;

		System.out.print("금액: ");
		int num = sc.nextInt();

		int m50000 = num / 50000;
		int m10000 = num % 50000 / 10000;
		int m5000 = num % 50000 % 10000 / 5000;
		int m1000 = num % 50000 % 10000 % 5000 / 1000;
		int m500 = num % 50000 % 10000 % 5000 % 1000 / 500;
		int m100 = num % 50000 % 10000 % 5000 % 1000 % 500 / 100;
		int m50 = num % 50000 % 10000 % 5000 % 1000 % 500 % 100 / 50;
		int m10 = num % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50 / 10;
		int m5 = num % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50 % 10 / 5;
		int m1 = num % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50 % 10 % 5 / 1;

		System.out.println("50000원: " + m50000 + "개");
		System.out.println("10000원: " + m10000 + "개");
		System.out.println("5000원: " + m5000 + "개");
		System.out.println("1000원: " + m1000 + "개");
		System.out.println("500원: " + m500 + "개");
		System.out.println("100원: " + m100 + "개");
		System.out.println("50원: " + m50 + "개");
		System.out.println("10원: " + m10 + "개");
		System.out.println("5원: " + m5 + "개");
		System.out.println("1원: " + m1 + "개");

		sc.close();
	}

}
