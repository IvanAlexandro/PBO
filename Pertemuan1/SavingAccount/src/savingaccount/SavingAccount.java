/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package savingaccount;
public class SavingAccount {

public double balance;
public double interestRate;
public String name;

public void displayCustomer() {
        System.out.println("Customer: "+ name);
        System.out.println("Balance: "+ balance);
        System.out.println("Rate: "+interestRate);
}
public static void main(String[] args){
SavingAccount sa = new SavingAccount();
sa.balance = 1000;
sa.interestRate = 0.15;
sa.name = "Iii";
sa.displayCustomer();
}
}
