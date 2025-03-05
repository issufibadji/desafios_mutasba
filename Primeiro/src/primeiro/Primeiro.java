/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeiro;

import java.util.Scanner;

/**
 *
 * @author Genaba
 */
public class Primeiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello word!");
        Scanner teclado = new Scanner(System.in);
//        int A = teclado.nextInt();
//        int B = teclado.nextInt();
//        int X = A + B;
//
//        teclado.close();
       double area = 10.123456; // Exemplo de valor para a variável area

        // Imprime o valor com 4 casas decimais e uma quebra de linha no final
        System.out.printf("A=%.4f%n", area);
    }

}
