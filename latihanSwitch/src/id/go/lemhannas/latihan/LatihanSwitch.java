package id.go.lemhannas.latihan;

import java.util.Scanner;

public class LatihanSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int patokan;
		System.out.print("Masukkan bilangannya :");
		Scanner in = new Scanner(System.in);
		patokan = in.nextInt();
		
		
		switch(patokan) {
		case 0 : System.out.println("Bilangan adalah 0"); break;
		case 5 : System.out.println("Bilangan adalah 5"); break;
		case 10 : System.out.println("Bilangan adalah 10"); break;
		default : System.out.println("Bilangan yang lainnya");
		}
	}

}
