/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_24;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        double nota;
        Scanner leer = new Scanner(System.in);
        
        //Lectura de la nota de un alumno
        System.out.print("Introduce la nota del alumno: ");
        nota = leer.nextDouble();
        
        //Según la nota esté comprendida entre ciertos números mostramos una calificación correspondiente
        if(nota >= 0){
            if(nota < 3)
                System.out.println("Muy deficiente");
            else if(nota < 5)
                System.out.println("Insuficiente");
            else if(nota < 6)
                System.out.println("Suficiente");
            else if(nota < 7)
                System.out.println("Bien");
            else if(nota < 9)
                System.out.println("Notable");
            else if(nota <= 10)
                System.out.println("Sobresaliente");
            else
                System.out.println("La nota introducida no está entre 0 y 10");
        }
    }
    
}
