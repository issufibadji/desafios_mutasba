/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03media;

import java.util.Scanner;

/**
 *
 * @author Genaba
 */
public class EX03Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1 = teclado.nextDouble();
        double n2 = teclado.nextDouble();
        double n3 = teclado.nextDouble();
        
        double media= ((n1*2)+(n2*3)+(n3*5))/10;
        
       System.out.printf("MEDIA =%.1f%n", media);
       teclado.close();
    }

}
