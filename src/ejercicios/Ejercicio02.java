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
public class Ejercicio02 {

    public static void main(String[] args) {
        //declarar variables
        int i, valor, res, nv, np, ni;
        Scanner lectura = new Scanner(System.in);

        //entrada de datos
        System.out.print("Ingresar el numero de valores: ");
        nv = lectura.nextInt();

        //proceso de datos
        np = ni = 0;
        for (i = 1; i <= nv; i++) {
            System.out.print("Ingresar el valor " + i + ": ");
            valor = lectura.nextInt();
            res = valor % 2;
            if (res == 0) {
                np++;
            } else {
                ni++;
            }
        }

        System.out.println("Hay " + np + " numero(s) par(es).");
        System.out.println("Hay " + ni + " numero(s) impar(es).");
    }
}
