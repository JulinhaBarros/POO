import java.util.Scanner;

public class DesafioTabuadaComFor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite um número: ");
        int tab = entrada.nextInt();
        int cont = 0;

        for (cont = 1; cont <= 10; cont ++ ) {
            System.out.println(tab + " x " + cont + " = " + (tab * cont));
        }
    }
}
