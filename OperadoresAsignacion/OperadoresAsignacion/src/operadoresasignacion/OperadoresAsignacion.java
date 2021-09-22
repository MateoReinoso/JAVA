/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresasignacion;

/**
 *
 * @author mateo
 */
public class OperadoresAsignacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numUno = 4, numDos = 2;
        //operador de asignacion =
        var resultado = numUno + 5 - numDos;
        System.out.println("resultado en operador de asignacion= " + resultado);
        // asignacion de operador composicion
        numUno += 1;
        System.out.println("operador composicion suma= " + numUno);
        
        numUno -= 2;
        System.out.println("operador composicion resta= " + numUno);
        
        numUno *= 2;
        System.out.println("operador composicion multiplicacion = " + numUno);
        
        numUno /= 2;
        System.out.println("operador composicion cociente = " + numUno);
        
        numUno %= 2;
        System.out.println("operador composicion residuo = " + numUno);
    }

}
