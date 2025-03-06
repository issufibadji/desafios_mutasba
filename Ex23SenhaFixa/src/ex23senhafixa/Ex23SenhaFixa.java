/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex23senhafixa;

import java.util.Scanner;

/**
 *
 * @author Genaba
 */
public class Ex23SenhaFixa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int senha = teclado.nextInt(); 

        while (senha != 2002) {  
            System.out.println("Senha Invalida");  
            senha = teclado.nextInt(); 
        }

        System.out.println("Acesso Permitido");  

        teclado.close();

    }
