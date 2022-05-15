/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan.pkg2;

public class Latihan2 {
    public static void main(String[] args) {
String custName = "Alex";
String itemDesc = "short";
Double price = 50.3;
Double tax = 5.2;
int quantity = 5;
String message = custName + " want to purchase " + quantity +" "+ itemDesc;
Double totalPrice = (price-tax) * quantity;
        System.out.println("Total price with tax is = "+ totalPrice);
    }
    
}
