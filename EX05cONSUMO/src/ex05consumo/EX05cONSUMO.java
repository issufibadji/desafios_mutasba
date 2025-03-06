/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex05consumo;

import java.util.Scanner;

/**
 *
 * @author Genaba
 */
public class EX05cONSUMO {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = teclado.nextInt();
        double y = teclado.nextDouble();
        double c =x/y;
        System.out.printf( "%.3f km/l",c);
    }

}
