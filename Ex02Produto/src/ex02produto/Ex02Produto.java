/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02produto;
import java.util.Scanner;
/**
 *
 * @author Genaba
 */
public class Ex02Produto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         int n1 = teclado.nextInt();
         int n2 = teclado.nextInt();
         
         int prod = n1* n2;
        
         System.out.println("PROD = "+prod);
         teclado.close();
        
        
    }
    
}
