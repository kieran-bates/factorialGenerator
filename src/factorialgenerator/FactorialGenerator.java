/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorialgenerator;

/**
 *
 * @author kibat6204
 */
import java.util.Scanner;
public class FactorialGenerator {

    /**
     * @param args the command line arguments
     */
    
    public static int factorialGenerator(int factorial)
    {
        int lastNumber = 1;
        
        for(int i = 1; i<factorial; i++)
        {
            lastNumber = lastNumber * (i+1);
        }
        return lastNumber;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("***FACTORIAL GENERATOR***");
        System.out.print("\nEnter a number -->");
        int factorial = input.nextInt();
        int output = factorialGenerator(factorial);
        System.out.println("\nfactorial = "+output);
        
    }
    
}
