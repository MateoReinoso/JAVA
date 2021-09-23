/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresrelacion;

/**
 *
 * @author mateo
 */
public class OperadoresRelacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //operadores de relacion hace referencia a mayor o menor igual
        var numUno = 3;
        var numDos = 2;
        var resultado = numUno > numDos;
        System.out.println("resultado = " + resultado);
        var resultadoUno = numUno < numDos;
        System.out.println("resultadoUno = " + resultadoUno);

        if (numUno % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Impar");
        }
        
        var edad = 15;
        
        var adulto = 18;
        
        if(edad >= adulto){
            System.out.println("Es adulto");
        }else{
            System.out.println("Es menor de edad");
        }
    }

}
