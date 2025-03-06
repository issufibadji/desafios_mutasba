/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex07distanciapercorrida;

import java.util.Scanner;

/**
 *
 * @author Genaba
 */
public class EX07Distanciapercorrida {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int km = teclado.nextInt();
        int m = 2;
        int d = km * 2 / 1;
        System.out.println(d + " minutos");
        teclado.close();
    }

}
