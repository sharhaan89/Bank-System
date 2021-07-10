
package BankSystem;

import java.io.*;

public class Banking 
{
    private static int balance = 0, amt = 0;
    private static int ch = 0;
    private static String name = "";
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    static void Deposit() throws IOException
    {
        System.out.println("----"+name+"'S BANK ACCOUNT----");
        System.out.println("Enter the amount you want to deposit: ");
        amt = Integer.parseInt(br.readLine());
        balance = balance + amt;
        System.out.println("Successfully Deposited");
        MainPage();
    }
    
    static void Withdraw() throws IOException
    {
        if(amt == 0)
        {
            System.out.println("No Balance!");
            Deposit();
        }
        System.out.println("----"+name+"'S BANK ACCOUNT----");
        System.out.println("Enter the amount you want to withdraw: ");
        amt = Integer.parseInt(br.readLine());
        if(amt > balance)
        {
            System.out.println("Balance is less than the amount inputted!");
            System.out.println("Try withdrawing again!");
            MainPage();
        }
        balance = balance - amt;
        if(balance == 0)
            System.out.println("All balance withdrew");
        MainPage();
    }
    
    static void CheckBalance() throws IOException
    {
        System.out.println("----"+name+"'S BANK ACCOUNT----");
        System.out.println("Net Balance: Rs "+balance);
        MainPage();
    }
    
    static void Exit() throws IOException
    {
        System.out.println("Successfully Exited");
        System.exit(0);
    }
    
    static void MainPage() throws IOException
    {
        System.out.println();
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        ch = Integer.parseInt(br.readLine());
        
        switch(ch)
        {
            case 1: Deposit(); break;
            case 2: Withdraw(); break;
            case 3: CheckBalance(); break;
            case 4: Exit(); break;
        }
    }
    
    public static void main(String args[]) throws IOException
    {
        System.out.println("Enter your name: ");
        name = br.readLine();
        name = name.toUpperCase();
        
        MainPage();
    }
}
