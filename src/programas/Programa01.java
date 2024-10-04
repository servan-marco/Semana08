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
public class Programa01 {

    public static void main(String[] args) {
        //declarar variables
        int i, ns;
        double ts, ps, sueldo;
        Scanner lectura = new Scanner(System.in);

        //entrada de datos
        System.out.print("Ingresar cantidad de sueldo: ");
        ns = lectura.nextInt();

        //proceso de datos
        ts = 0.0;
        for (i = 1; i <= ns; i++) {
            System.out.print("Ingresar sueldo " + i + ": ");
            sueldo = lectura.nextDouble();
            ts += sueldo;
        }

        ps = ts / ns;

        //salida de datos
        System.out.println("El total de sueldos es: " + ts);
        System.out.println("El promedio de sueldos es: " + ps);
    }
}
