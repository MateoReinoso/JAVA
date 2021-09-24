/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciaswitch;

/**
 *
 * @author mateo
 */
public class SentenciaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var numero = 2;
        var numeroTexto = "Valor desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Numero desconocido";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }

}
