/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex17mediaponderada;

import java.util.Scanner;

/**
 *
 * @author Genaba
 */
public class Ex17MediaPonderada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        for (int i = 0; i < N; i++) {
            double valor1 = teclado.nextDouble();
            double valor2 = teclado.nextDouble();
            double valor3 = teclado.nextDouble();
            double mediaPonderada = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / (2 + 3 + 5);
            System.out.printf("%.1f%n", mediaPonderada);
        }

        teclado.close();
    }

}
