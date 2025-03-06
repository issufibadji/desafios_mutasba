/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex16tabuada;

import java.util.Scanner;

/**
 *
 * @author Genaba
 */
public class EX16Tabuada {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int i = 1;
        int n1 = teclado.nextInt();
        while (i <= 10) {
            System.out.println(i+ " x "+n1+" = "+(i*n1) );
            i++;
        }
        teclado.close();
    }

}
