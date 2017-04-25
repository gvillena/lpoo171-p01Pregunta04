/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01.pregunta04;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class P01Pregunta04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numeroGenerado = new Random().nextInt(101);        
        int i; 
        int intentos = 10;
        do {            
            System.out.println("Ingrese un numero: ");
            i = Integer.parseInt(reader.nextLine());                        
            if ( i > numeroGenerado ) {                
                System.out.println("¡El numero es menor!");
                intentos--;
            }
            else if( i < numeroGenerado ) {
                System.out.println("¡El numero es mayor!");
                intentos--;
            }                
            if ( intentos == 0 ) {
               break;
            }
        } while ( i != numeroGenerado);
        
        if (intentos > 0) {
            System.out.println("¡Felicitaciones, acertaste en tan solo " + (10 - intentos) + " intentos!");                    
        }
        else {
            System.out.println("¡Se acabaron tus intentos!");        
        }        
    }
    
}
