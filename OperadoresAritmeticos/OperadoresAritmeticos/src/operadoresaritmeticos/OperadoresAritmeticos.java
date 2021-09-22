/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author mateo
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // definicion de variables mediante var
        double numeroUno = 3, numeroDos = 2;
        var resultado = (int) (numeroUno + numeroDos);
        System.out.println("resultado suma= " + resultado);

        var resultado1 = (int) (numeroUno - numeroDos);
        System.out.println("resultado resta= " + resultado1);

        var resultado2 = (int) (numeroDos * numeroUno);
        System.out.println("resultado multiplicacion = " + resultado2);

        var resultado3 = numeroUno / numeroDos;
        System.out.println("resultado3 cociente= " + resultado3);
        
        var resultado4 = numeroUno % numeroDos;
        System.out.println("resultado3 residuo= " + resultado4);
        
        if(numeroUno%2==0){
            System.out.println("Numero par");
        }else{
            System.out.println("Numero impar");
        }
    }

}
