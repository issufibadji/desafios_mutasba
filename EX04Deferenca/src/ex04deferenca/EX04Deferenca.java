/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04deferenca;

import java.util.Scanner;

/**
 *
 * @author Genaba
 */
public class EX04Deferenca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();
        int deferenca = (a * b) - (c * d);
        System.out.println("DIFERENCA = "+deferenca);
        teclado.close();
    }

}
