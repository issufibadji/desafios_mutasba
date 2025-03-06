/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex20sequeiciaij3;

/**
 *
 * @author Genaba
 */
public class EX20Sequeiciaij3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int I = 1; I <= 9; I += 2) {
            for (int J = 7 + (I - 1); J >= 5 + (I - 1); J--) {  
                System.out.println("I=" + I + " J=" + J);
            }
        }
    }
    
}
