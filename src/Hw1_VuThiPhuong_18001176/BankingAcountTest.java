package Hw1_VuThiPhuong_18001176;
import java.util.ArrayList;
import java.util.Scanner;

public class BankingAcountTest {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void input(ArrayList<BankingAccount> banks,int n) {
		for(int i = 0; i< n; i++) {
			String name = sc.nextLine();
		if( name.equals("Saving")) {
			System.out.println("tien gui:");
			float deposit = Float.parseFloat(sc.nextLine());
			System.out.println("lai suat tren thang:");
			float interest = Float.parseFloat(sc.nextLine());
			System.out.println("So thang gui:");
			int term = Integer.parseInt(sc.nextLine());
			float withdraw = 0;
			SavingAccount sav = new SavingAccount(deposit,withdraw,interest,term);
			banks.add(sav);
		}
		else if(name.equals("Normal"))
		{
			System.out.println("So tien gui:");
			float deposit = Float.parseFloat(sc.nextLine());
			float withdraw = deposit;
			NormalAccount nor = new NormalAccount(deposit,withdraw);
			banks.add(nor);		
			}
		}
	}	
	public static void print(ArrayList<BankingAccount> banks) {
		for(int i = 0; i < banks.size() ; i++) {
			System.out.println(banks.get(i).toString());
		}
	}
	public static void main(String [] args) {
		System.out.println("Nhap so cac tai khoan:");
		int n = Integer.parseInt(sc.nextLine());
		ArrayList< BankingAccount> banks = new ArrayList<>();
		
		input(banks,n);
		print(banks);
	}
}
