/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

import java.util.Scanner;

/**
 *
 * @author serva
 */
public class Programa03 {

    public static void main(String[] args) {
        //declarar variables
        int i, np, cpsm, cpsf;
        double talla, tmy;
        String nomb, xnombre, sexo;

        Scanner lectura = new Scanner(System.in);

//entrada de datos
        System.out.print("Ingresar cantidad de personas: ");
        np = lectura.nextInt();

        //proceso de datos
        talla = tmy = 0.0;
        cpsm = cpsf = 0;

        xnombre = nomb = "";

        for (i = 1; i <= np; i++) {
            System.out.print("Ingresar el nombre de la persona " + i + ": ");
            nomb = lectura.next();

            System.out.print("Ingresar el sexo de la persona " + i + ": ");
            sexo = lectura.next();

            if (sexo.equals("M") || sexo.equals("m")) {
                cpsm++;
            } else if (sexo.equals("F") || sexo.equals("f")) {
                cpsf++;
            } else {
                System.out.print("Ingresar un sexo correcto M o F");
                break;
            }

            System.out.print("Ingresar la talla de la persona " + i + ": ");
            talla = lectura.nextDouble();

            if (talla > tmy) {
                tmy = talla;
                xnombre = nomb;
            }

            System.out.println();
        }

        //salida de datos
        System.out.println("El total de hombres es: " + cpsm);
        System.out.println("El total de mujeres es: " + cpsf);
        System.out.println("La persona mas alta es: " + xnombre);
        System.out.println("Su talla es: " + tmy);
    }
}
