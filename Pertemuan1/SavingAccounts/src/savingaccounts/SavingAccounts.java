/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package savingaccounts;

/**
 *
 * @author User
 */
public class SavingAccounts {

    /**
     * @param args the command line arguments
     */
public double balance;
public double interestRate;
public String name;

public void displayCustomer(){
System.out.println("Customer: "+ name);
        System.out.println("Balance: "+ balance);
        System.out.println("Rate: "+interestRate);
}
    public static void main(String[] args) {
        // TODO code application logic here


    }//end metohd displayCustomer
    
}//end class SavingAccount
