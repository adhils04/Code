import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

abstract class Account{
    abstract void deposit();
    abstract void withdraw();
}
class SavingsAccount extends Account{
    void deposit(){
        System.out.println("Deposited $1000.0 into Savings Account.");
    }
    void withdraw(){
        System.out.println("Withdrawn $500.0 from Savings Account.");
    }
}
class CheckingAccount extends Account{
    void deposit(){
        System.out.println("Deposited $2000.0 into Checking Account.");
    }
    void withdraw(){
        System.out.println("Withdrawn $1000.0 from Checking Account.");
    }
}

public class D8_P2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String n=input.nextLine();
        SavingsAccount s=new SavingsAccount();
        s.deposit();
        s.withdraw();
        CheckingAccount c=new CheckingAccount();
        c.deposit();
        c.withdraw();
    }
}