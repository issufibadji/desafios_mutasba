/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex08convertertempo;

import java.util.Scanner;

/**
 *
 * @author Genaba
 */
public class Ex08ConverterTempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt(); 
        int horas = N / 3600; 
        int minutos = (N % 3600) / 60; 
        int segundos = N % 60; 
        System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
        teclado.close();
    }

}
