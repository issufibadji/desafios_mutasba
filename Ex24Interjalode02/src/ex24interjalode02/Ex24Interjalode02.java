/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex24interjalode02;

import java.util.Scanner;

/**
 *
 * @author Genaba
 */
public class Ex24Interjalode02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt(); 
        int inCount = 0;  
        int outCount = 0;  
        for (int i = 0; i < N; i++) {
            int X = teclado.nextInt();  

            if (X >= 10 && X <= 20) { 
                inCount++;
            } else {
                outCount++;
            }
        }
        System.out.println(inCount + " in");
        System.out.println(outCount + " out");

        teclado.close();
    }

}
