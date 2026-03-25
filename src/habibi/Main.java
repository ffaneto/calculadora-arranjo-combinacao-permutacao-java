/*
Pn = n!
An, p = n!/(n-p)!
Cn,p = n!/p! * (n-p)!
*/

package habibi;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Arranjo (a) , Combinação (c), Permutação (p) ou Sair(s)? ");
            char ch = sc.next().toLowerCase().charAt(0);

            if (ch == 's') {
                break;
            }

            int n = 0;
            int p = 0;
            long result = 0;


            if (ch == 'a') {
                System.out.print("Valor de n: ");
                n = sc.nextInt();
                System.out.print("Valor de p: ");
                p = sc.nextInt();

                int nMenosp = n - p;

                result = fatorial(n) / fatorial(nMenosp);

                System.out.println(result);

            } else if (ch == 'c') {
                System.out.print("Valor de n: ");
                n = sc.nextInt();
                System.out.print("Valor de p: ");
                p = sc.nextInt();

                int nMenosp = n - p;

                result = fatorial(n) / (fatorial(p) * fatorial(nMenosp));

                System.out.println(result);

            } else if (ch == 'p') {
                System.out.print("Valor de n: ");
                n = sc.nextInt();

                result = fatorial(n);

                System.out.println(result);
            } else {
                System.out.println("Opção Inválida");
            }
        }
        System.out.println();

        sc.close();
    }


    public static long fatorial (int n) {
        if (n <0) {
            System.out.println("Não há fatorial de um n inteiro negativo");
            return -1;
        } else if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * fatorial(n-1);
        }
    }

}