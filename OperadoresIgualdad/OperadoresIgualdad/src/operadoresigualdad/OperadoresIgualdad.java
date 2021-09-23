/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresigualdad;

/**
 *
 * @author mateo
 */
public class OperadoresIgualdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var numUno = 3;
        var numDos = 2;
        
        //operdador de igualdad
        var resuldato = (numUno == numDos);
        System.out.println("resuldato = " + resuldato);
        
        var resultado = (numUno != numDos);
        System.out.println("resultado = " + resultado);
        
        var cadenaUno = "adios";
        var cadenaDos = "adios";
        var unionCadena = cadenaUno == cadenaDos;// compara referencia de objetos
        System.out.println("unionCadena = " + unionCadena);
        
        var unionCadenaUno = cadenaUno.equals(cadenaDos);//compara contenido de cadenas
        System.out.println("unionCadenaUno = " + unionCadenaUno);
        
    }
    
}
