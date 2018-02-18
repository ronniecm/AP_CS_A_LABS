package SecondTerm.ClassLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 3 - Account Lab
What I learned:
************************************************/
import java.text.*;

public class Account
{
   private double balance;
   DecimalFormat d = new DecimalFormat("0.00");
   
   public Account()
   {
      this.balance = 0.0;
   }
   
   public Account(double balance)
   {
      this.balance = balance;
   }
   
   public void deposit(double amount)
   {
      System.out.println("Amount deposited: $" + d.format(amount));
      this.balance += amount;
   }
   
   public void withdraw(double amount)
   {
      System.out.println("Amount withdrawn: " + amount);
      if (amount > balance)
      {
         System.out.print("No more money left.");
         System.out.println("$5 has been charged to your account.");
         this.balance = -5;
      } else {
         this.balance -= amount;
      }
   }
   
   public void checkBalance()
   {
      System.out.println("$" + d.format(this.balance));
   }
   
   public boolean equals(Account other)
   {
      return this.balance == other.balance;
   }
      
   public String toString()
   {
      return "Balance: $" + d.format(this.balance);
   }
   
   public static void main(String[] args)
   {
      Account bank = new Account(100);
      System.out.println(bank);
      bank.deposit(50);
      bank.checkBalance();
      bank.withdraw(200);
      System.out.println(bank);
   } 
}

/* Output

 ----jGRASP exec: java Account
 Balance in account: $100.00
 Amount deposited: $50.00
 $150.00
 Amount withdrawn: 200.0
 No more money left. $5 has been charged to your account.
 Balance in account: $-5.00
 
  ----jGRASP: operation complete.
 
 */