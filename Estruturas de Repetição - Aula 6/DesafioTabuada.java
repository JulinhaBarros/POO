import java.util.Scanner;

public class DesafioTabuada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite um número: ");
        int tab = entrada.nextInt();

        System.out.println(tab + " x 0 = " + (tab * 0));
        System.out.println(tab + " x 1 = " + (tab * 1));
        System.out.println(tab + " x 2 = " + (tab * 2));
        System.out.println(tab + " x 3 = " + (tab * 3));
        System.out.println(tab + " x 4 = " + (tab * 4));
        System.out.println(tab + " x 5 = " + (tab * 5));
        System.out.println(tab + " x 6 = " + (tab * 6));
        System.out.println(tab + " x 7 = " + (tab * 7));
        System.out.println(tab + " x 8 = " + (tab * 8));
        System.out.println(tab + " x 9 = " + (tab * 9));
        System.out.println(tab + " x 10 = " + (tab * 10));
    }
}
