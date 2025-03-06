/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex21samadeimpares;

import java.util.Scanner;

/**
 *
 * @author Genaba
 */
public class Ex21SamaDeimpares {

    /**
     * @param args the command line arguments
     */

        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
            int N = teclado.nextInt();
            for (int i = 0; i < N; i++) {
                int X = teclado.nextInt();
                int Y = teclado.nextInt();
                int soma = 0;
                if (X > Y) {
                    int temp = X;
                    X = Y;
                    Y = temp;
                }
                for (int j = X + 1; j < Y; j++) {
                    if (j % 2 != 0) {
                        soma += j;
                    }
                }
                System.out.println(soma);
            }

            teclado.close();

        }

    }


