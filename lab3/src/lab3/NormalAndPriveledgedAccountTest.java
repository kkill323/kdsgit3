package lab3;

import java.util.Scanner;

public class NormalAndPriveledgedAccountTest {
	public static void main(String[] args) {

		System.out.println("-----------------------WELCOME USER-------------------");

		System.out.println("This program prints the basic account details including account type and bank balance.");

		System.out.println("--------------------------------------------------------\n");

		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);

		System.out.println("would you like to open a new account?");

		String str=obj.nextLine();

		if(str.equals("yes")||str.equals("YES"))

		{

		System.out.println("Enter the initial amount.");

		double amt=obj.nextDouble();

		Account acc=null;

		if(amt>=100000)

		{

		acc=new PriviledgedAccount();

		}

		else

		acc=new NormalAccount();

		//set the amount

		acc.setAccountBalance(amt);

		System.out.println("Please enter your name.");

		String name=obj.nextLine();//to absorb extra new line character

		name=obj.nextLine();//to input the name

		acc.setOwnerName(name);

		System.out.println("Please enter the number of transactions expected for this account.");

		int tran=obj.nextInt();

		if(tran<30)

		acc.setMonthlyCharge(10);

		else

		acc.setMonthlyCharge(100);

		//print the information

		System.out.println(acc.getDetails());

		}

		}

		}

