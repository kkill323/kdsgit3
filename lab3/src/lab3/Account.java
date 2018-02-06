package lab3;

import java.util.Scanner;

abstract class Account{

private double accountBalance;

private String ownerName;

private String accountType; //this is simply to output

private double monthlyCharge;

/**

* @return the accountBalance

*/
public double getAccountBalance() {

return accountBalance;

}

/**

* @param accountBalance the accountBalance to set
*/

public void setAccountBalance(double accountBalance) {

this.accountBalance = accountBalance;

}

/**

* @return the ownerName

*/

public String getOwnerName() {

return ownerName;

}

/**

* @param ownerName the ownerName to set

*/

public void setOwnerName(String ownerName) {

this.ownerName = ownerName;

}

/**

* @return the accountType

*/

public String getAccountType() {

return accountType;

}

/**

* @param accountType the accountType to set

*/

public void setAccountType(String accountType) {

this.accountType = accountType;

}

/**

* @return the monthlyCharge

*/

public double getMonthlyCharge() {

return monthlyCharge;

}

/**

* @param monthlyCharge the monthlyCharge to set

*/

public void setMonthlyCharge(double monthlyCharge) {

this.monthlyCharge = monthlyCharge;

}

//get details method

public String getDetails()

{

return "\n\nAccount Balance : "+accountBalance+"\nOwner Name : "+ownerName+"\nAccount Type : "+accountType+

"\nMonthly Charge : "+monthlyCharge+"\n";

}

}

class NormalAccount extends Account{//class extends basic account class

NormalAccount()

{//constructor

super.setAccountType("Normal Account");//set type of account

}

}

class PriviledgedAccount extends Account{//class extends basic account class

PriviledgedAccount()

{//constructor

super.setAccountType("Priviledged Account");//set account type

}

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









   