package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		System.out.println(c);
		
		for (int i = 0; i < c.length; i++) {
			c[4] = ',';
			c[7] = ',';
			c[9] = ',';
			System.out.print(c[i]);
		}
	}

}
