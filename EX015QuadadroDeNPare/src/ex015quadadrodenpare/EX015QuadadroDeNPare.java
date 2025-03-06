package ex015quadadrodenpare;

import java.util.Scanner;

public class EX015QuadadroDeNPare {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 1;
        int n1 = teclado.nextInt();
        while (i <= n1) {
            if (i % 2 == 0) {
                int q = (int) Math.pow(i, 2);
                System.out.println(i + "^2 = " + q);

            }
            i++;
        }
        teclado.close();
    }

}
