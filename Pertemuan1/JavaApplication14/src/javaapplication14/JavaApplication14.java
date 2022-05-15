
package javaapplication14;

import java.util.Scanner;


public class JavaApplication14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numInputs = 10, input = 0, sum = 0, stopLoop = 999;
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < numInputs; i++){
            input = in.nextInt();
            if (input == stopLoop){
                break;
            }
else{
sum += input;
}//endif
}//end for
System.out.println("The sum of the numbers: "+ sum);
    }//end method main
    
}
