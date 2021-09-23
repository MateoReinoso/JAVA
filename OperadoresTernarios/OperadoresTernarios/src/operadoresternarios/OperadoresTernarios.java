/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresternarios;

/**
 *
 * @author mateo
 */
public class OperadoresTernarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //operador ternatrio
        var resultado = (3 < 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);

        var numero = 9;
        resultado = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("resultado = " + resultado);

    }

}
