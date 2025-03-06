/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex07comsumo;

import java.util.Scanner;

/**
 *
 * @author Genaba
 */
public class EX07Comsumo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int h = teclado.nextInt();
        int km = teclado.nextInt();
        double dest = h * km;
        double c = dest /12;
        System.out.printf("%.3f%n", c);
        teclado.close();
    }

}
