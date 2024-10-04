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
public class Ejercicio01 {

    public static void main(String[] args) {
        //declarar variables
        int i, num, res;
        String divisores;
        Scanner lectura = new Scanner(System.in);

        //entrada de datos
        System.out.print("Ingresar el numero: ");
        num = lectura.nextInt();

        //proceso de datos
        divisores = "";
        for (i = 1; i <= num; i++) {
            res = num % i;
            if (res == 0) {
                divisores += i + " ";
            }
        }

        System.out.println("Los divisores son: " + divisores);
    }
}
