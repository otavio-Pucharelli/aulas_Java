package Program;

import java.util.Scanner;
import model.entities.Account;
import model.exceptions.DomainException;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter account data");
           
            System.out.print("Number: ");
            Integer number = sc.nextInt();
           
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            
            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();
            
            Account account = new Account(number, holder, balance, withdrawLimit);
            System.out.println();
            
            System.out.print("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();
            account.withdraw(amount);
            
            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error");
        }
        
        sc.close();
    }
}
