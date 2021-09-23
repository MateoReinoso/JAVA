/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tarea 4 - calcular el área y el perímetro de un Rectángulo");
        System.out.println("Proporcione el alto: ");
        var alto = sc.nextDouble();
        System.out.println("Proporcione el ancho: ");
        var ancho = sc.nextDouble();
        if (alto > 0 && ancho > 0) {
            var area = alto * ancho;
            System.out.println("area = " + area);
            var perimetro = (alto + ancho) * 2;
            System.out.println("perimetro = " + perimetro);
        }else{
            System.out.println("Los datos son incorrectos");
        }
    }
    
}
