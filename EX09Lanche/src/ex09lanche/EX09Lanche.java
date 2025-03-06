/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex09lanche;

import java.util.Scanner;

/**
 *
 * @author Genaba
 */
public class EX09Lanche {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo = teclado.nextInt();
        int q = teclado.nextInt();
        switch (codigo) {
            case 1:
                double rs = q * 4.00;
                System.out.printf("Total: R$ %.2f%n", rs);
                break;
            case 2:
                double rs1 = q * 4.50;
                System.out.printf("Total: R$ %.2f%n", rs1);
                break;
            case 3:
                double rs2 = q* 5.00;
                System.out.printf("Total: R$ %.2f%n", rs2);
                break;
            case 4:
                double rs3 = q * 2.00;
                System.out.printf("Total: R$ %.2f%n", rs3);
                break;
            case 5:
                double rs4 = q * 1.50;
                System.out.printf("Total: R$ %.2f%n", rs4);
                break;

        }
        teclado.close();

    }

}
