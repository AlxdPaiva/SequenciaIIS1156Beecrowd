/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sequenciaiis1156beecrowd;

/**
 *
 * @author alxdr
 */
public class SequenciaIIS1156Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numerador = 1;
        double denominador = 1;
        double S = 1;
        
        for (int i = 1; i < 20; i++) {
            numerador = numerador + 2;
            denominador = denominador * 2;
            S = S + (numerador/denominador);
            /*System.out.println(numerador);
            System.out.println(denominador);
            System.out.println(S);
            System.out.println("");*/
        }
        System.out.printf("%.2f", S);
    }
    
}
