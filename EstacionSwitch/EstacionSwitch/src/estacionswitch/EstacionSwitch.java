/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionswitch;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class EstacionSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Estacion de anio");
        System.out.println("Ingrese el mes para saber la estacion");
        int mes = Integer.parseInt(sc.nextLine());
        var estacion = "Estacion desconocida";
        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otonio";
                break;
        }
        System.out.println("estacion = " + estacion);
        System.out.println("Fin de estructuras de control");
    }

}
