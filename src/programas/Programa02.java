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
public class Programa02 {

    public static void main(String[] args) {
        //declarar variables
        int i;
        double vta, tv, pv, vmy;
        String mes;
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio"};
        Scanner lectura = new Scanner(System.in);

        //proceso de datos
        tv = pv = vmy = vta = 0.0;
        mes = "";
        for (i = 1; i <= 6; i++) {
            System.out.print("Ingresar sueldo de " + meses[i - 1] + ": ");
            vta = lectura.nextDouble();
            tv += vta;
            if (vta > vmy) {
                vmy = vta;
                mes = meses[i - 1];
            }
        }

        pv = tv / 6;

        //salida de datos
        System.out.println("El total de ventas es: " + tv);
        System.out.println("El promedio de ventas es: " + pv);
        System.out.println("El mes de mayor venta es: " + mes);
        System.out.println("La mayor es: " + vmy);
    }

}
