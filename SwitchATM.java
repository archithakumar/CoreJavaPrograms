package SwitchCase;

import java.util.*;

public class SwitchATM 
{

public static void main(String[] args) 
{
	int balance = 100, withdraw, deposit;
    Scanner sc = new Scanner(System.in);
    while(true)
    {
    	System.out.println("***Welcome to ATM***");
    	System.out.println("1) Deposit");
    	System.out.println("2) Withdraw");
    	System.out.println("3) Balance");
    	System.out.println("4) Exit");
    	System.out.print("Enter your Choice:");
    	int n = sc.nextInt();
    switch(n)
    {
    case 1:
    	System.out.print("Enter money to deposit:");
    	deposit = sc.nextInt();
    	balance = balance + deposit;
    	System.out.println("Your Money has been deposited");
    	System.out.println("");
    	break;
    	
    case 2:
    	System.out.print("Enter money to withdraw:");
    	withdraw = sc.nextInt();
    	if(balance >= withdraw)
    	{
    		balance = balance - withdraw;
    		System.out.println("Your Withdrawal money");
    	}
    	else
    	{
    		System.out.println("There is no Balance");
    	}
    	System.out.println("");
    	break;
    	
    case 3:
    	System.out.println("Your Balance : "+balance);
    	System.out.println("");
    	break;
    case 4:
    	System.exit(0);
    	sc.close();
    }
    
}
    
}
}
