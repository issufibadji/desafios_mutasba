package ex13paresimparesnegativopositivos;

import java.util.Scanner;

public class Ex13ParesImparesNegativoPositivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 1;
        int ps = 0;
        int ng = 0;
        int pares = 0;
        int impares = 0;
        while (i <= 5) {
            double n1 = teclado.nextDouble();
            if (n1 % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            if (n1 > 0) {
                ps++;
            } else if(n1<0){
                ng++;
            }
            i++;
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(ps + " valor(es) positivo(s)");
        System.out.println(ng + " valor(es) negativo(s)");
        teclado.close();
    }

}
