/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresunarios;

/**
 *
 * @author mateo
 */
public class OperadoresUnarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // operador unario sirve cambio de signo
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        var d = !c;
        
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //incremento
        //preincremento
        var e = 3;
        var f = ++e;//primero se incremnta la variable y despues usa su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        //post incremento despues de la variablle
        var  g = 5;
        var h = g++;// primero se usa la variable y despues se incrementa
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //predecremento
        var i = 6;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        // decremento
        var k = 6;
        var l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
                
    }
    
}
