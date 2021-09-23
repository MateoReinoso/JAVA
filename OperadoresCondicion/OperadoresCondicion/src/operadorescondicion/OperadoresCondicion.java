/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorescondicion;

/**
 *
 * @author mateo
 */
public class OperadoresCondicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //operador and
        var numUno = 20;
        var valorMinimo = 0;
        var valorMaximo = 10;

        if (numUno >= valorMinimo && numUno <= valorMaximo) {
            System.out.println("Numero dentro del rango");
        } else {
            System.out.println("Fuera del rango");
        }

        //operador or
        var vacaciones = true;
        var diaDescanso = false;

        if (vacaciones || diaDescanso) {
            System.out.println("Padre puede asistir al juego");
        } else {
            System.out.println("El padre esa ocupado");
        }

    }

}
