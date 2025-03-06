/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex12pareslidas;

import java.util.Scanner;

/**
 *
 * @author Genaba
 */
public class Ex12Pareslidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 1;
        int ps = 0;
        while (i <= 5) {
            double n1 = teclado.nextDouble();
            if (n1 %2== 0) {
                ps++;
            }
            i++;
        }
        System.out.println(ps + " valores pares");
    }

}
