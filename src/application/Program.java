package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Account;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print(" enter acount namber: ");
		int nunber = sc.nextInt();
		System.out.println("enter account holder:");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println(" is there an anitial deposit (y/n)? ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.println("enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(nunber, holder, initialDeposit);
		} else {
			account = new Account(nunber, holder);
		}

		System.out.println();

		System.out.println("account data set: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("enter a deposit value:");
		double depositvalue = sc.nextDouble();
		account.deposit(depositvalue);
		System.out.println("updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("enter a withidrow value:");
		double withidrowvalue = sc.nextDouble();
		account.withdrown(withidrowvalue);
		System.out.println("updated account data: ");
		System.out.println(account);
		
		
	}
}
