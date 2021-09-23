/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package precedenciaoperadores;

/**
 *
 * @author mateo
 */
public class PrecedenciaOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var numUno = 5;
        var numDos = 10;
        var resultado = ++numUno + numDos--;// numuno tiene 6 y numdos tiene 10
        System.out.println("numuno" + numUno);
        System.out.println("numdos" + numDos);// nueva asigancion numdos tiene 9
        System.out.println("resultado = " + resultado);

        var resultadoUno = 4 + 5 * 6 / 3;
        System.out.println("resultadoUno = " + resultadoUno);

    }

}
