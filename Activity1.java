import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
        
        System.out.print("Enter loan amount:");
        int principal = s.nextInt();
        if (principal < 1000)
        System.out.print("Invalid amount");
        else if (principal > 100000)
        System.out.print("Invalid Amount");
        
        System.out.print("Enter Interest rate:");
        double intRate = s.nextInt();
   
        double rate = intRate/100;
        double interest = principal * rate;
        System.out.print("\nInterest Amount per Month:" + interest);
        
        System.out.print("\nEnter loan terms:");
        int loanTerms = s.nextInt();
        
        double amount = interest * loanTerms;
        System.out.print("\nTotal Interest Amount:" + amount);
        
        double loanAmount = principal + amount;
        System.out.print("\nTotal loan amount:" + loanAmount);
        
        double pay= loanAmount / loanTerms;
        System.out.print("\nPayment per month:" + pay);
        
    }
}



