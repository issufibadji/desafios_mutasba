/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex22crecentedecrecente;

import java.util.Scanner;

/**
 *
 * @author Genaba
 */
public class EX22CrecenteDecrecente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            int X = teclado.nextInt();
            int Y = teclado.nextInt();
            if (X == Y) {
                break;
            }
            if (X < Y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }
        }

        teclado.close();

    }

}
