/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author serva
 */
public class Ejercicio03 {

    public static void main(String[] args) {
//declarar variables
        int i, num, fact;
        Scanner lectura = new Scanner(System.in);

        //entrada de datos
        System.out.print("Ingresar un numero mayor que cero: ");
        num = lectura.nextInt();

        //proceso de datos
        fact = 1;

        for (i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("El numero factorial es: " + fact);
    }
}
