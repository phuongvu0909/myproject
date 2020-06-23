package Hw1_VuThiPhuong_18001176;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManagerTest {
	static Scanner sc = new Scanner(System.in);
	
	public static void input(ArrayList<AccountManager> mans) {
		System.out.println("Nhap kieu tai khoan se dung:");
		String namemanager = sc.nextLine();
		if( namemanager.equals("Saving")) {
			System.out.println("tien gui:");
			float deposit = Float.parseFloat(sc.nextLine());
			System.out.println("lai suat tren thang:");
			float interest = Float.parseFloat(sc.nextLine());
			System.out.println("So thang gui:");
			int term = Integer.parseInt(sc.nextLine());
			float withdraw = 0;
			SavingAccountManager sav = new SavingAccountManager(deposit,withdraw,interest,term);
			mans.add(sav);
			
		}
		else if(namemanager.equals("Normal"))
		{
			System.out.println("So tien gui:");
			float deposit = Float.parseFloat(sc.nextLine());
			System.out.println("so tien chuyen khoan:");
			float transfer = Float.parseFloat(sc.nextLine());
			System.out.println("Ngan hang nguoi nhan dung:");
			//in or out
			String receivebank = sc.nextLine();
			float withdraw = 0;
			 NormalAccountManager nor = new NormalAccountManager(deposit,transfer,receivebank,withdraw);
			mans.add(nor);
			}
		}
	public static void main(String [] args) {
		ArrayList<AccountManager> mans = new ArrayList<>();
		input(mans);
		System.out.println(mans.get(0).toString());
	}
}
