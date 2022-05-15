/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pcb;

/**
 *
 * @author User
 */
public class Pcb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int counter = 0;
        int sum = 0;
        while (counter < 100){ 
               counter++; 
               if (counter % 10 == 0 ){
continue;
                }
                else {
                        sum += counter;
                }//endif
            }//end while
            System.out.println("Sum of 1 - 99: "+ sum );
     //end method main
    }
    
}
