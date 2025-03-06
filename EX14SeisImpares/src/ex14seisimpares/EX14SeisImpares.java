/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex14seisimpares;

import java.util.Scanner;

/**
 *
 * @author Genaba
 */
public class EX14SeisImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 1;
        int n1 = teclado.nextInt();
        while (i <= 6) {

            if (n1 % 2 != 0) {
                System.out.println(n1);  
                i++;
            } 
            n1++; 
        
        }
        teclado.close();

    }

}
