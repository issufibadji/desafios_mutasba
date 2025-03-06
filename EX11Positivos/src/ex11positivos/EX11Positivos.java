package ex11positivos;

import java.util.Scanner;

public class EX11Positivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 1;
        int ps = 0;
        while (i <= 6) {
            double n1 = teclado.nextDouble();
            if (n1 > 0) {
                ps++;
            }
            i++;
        }
        System.out.println(ps + " valores positivos");
    }

}
