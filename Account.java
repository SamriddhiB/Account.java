/*Design a class named Account that contains:
 A private int data field named id for the account (default 0).
 A private double data field named balance for the account (default stores the current interest rate (default 7%). Assume all accounts havethe same interest rate.
 A private Date data field named dateCreated that stores the date when the account was created.
 A no-arg constructor that creates a default account.
 A constructor that creates an account with the specified id and initial balance.
 The accessor and mutator methods for id, balance, andfor dateCreated.
 A method getMonthlyInterestRate() that returns the monthly interest rate.
 A method named getMonthlyInterest() that returns the monthly interest.
 method withdraw that withdraws a specified amount from the account.
 A method named deposit that deposits a specified amount to the account.*/


import java.util.*;
import java.util.Scanner;
import java.util.Date;
class Account
{
String id;
Scanner s=new Scanner(System.in);
double balance,annualInterestRate;
Date date;

Account()
{
 id="";
 balance=500;
 annualInterestRate=7;
date="12/02/2001";
}
Account(int i,double b)
{
id=i;
balance=b;
}
int getId()
{
return id; 
}
double getBalance()
{ 
    return balance;
}
double getAnnualInterestRate()
{ 
    return annualInterestRate; 
}
String getDateCreated()
{ 
    return date; 
}
 
    public static double getMonthlyInterest(Account obj)
{ 
    return (obj.getBalance() * obj.getAnnualInterestRate() * 0.01 / 12);
}
public static double getI1nthlyInterestRate(Account obj)
{ 
    return ((obj.getAnnualInterestRate()/1200) * (getMonthlyInterest(obj)));
}
public static void withdraw(Account obj)
{ 
    double with;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the amount to be withdrawn:");
with=s1.nextDouble();
obj.balance=obj.balance-with;
System.out.println("Current Balance is: " + obj.balance); }

public static void Deposit(Account obj)
{ 
    double dep;
Scanner s2=new Scanner(System.in);
System.out.println("Enter the amount to be Deposited:");
dep=s2.nextDouble();
obj.balance=obj.balance+dep;
System.out.println("Current Balance is: " + obj.balance);
}

public static void main(String args[])
{ 
    Account a=new Account();
double I1,I2;
I1=getMonthlyInterest(a);
I2=getI1nthlyInterestRate(a);
withdraw(a);
Deposit(a);
System.out.println("Monthly interest is:"+ I1 + " \n"+"Monthly interest rate is:"+ I2 );
}
}
