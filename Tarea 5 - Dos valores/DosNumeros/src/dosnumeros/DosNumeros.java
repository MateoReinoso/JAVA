/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosnumeros;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class DosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numUno = 0, numDos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tarea 5 - Mayor de dos numeros");
        System.out.println("Proporcione el numero 1");
        numUno = sc.nextInt();
        System.out.println("Proporcione el numero 2");
        numDos = sc.nextInt();
        if (numUno > numDos) {
            System.out.println("Mayor numUno: " + numUno);
        } else {
            System.out.println("Mayor numDos: " + numDos);
        }
    }

}
