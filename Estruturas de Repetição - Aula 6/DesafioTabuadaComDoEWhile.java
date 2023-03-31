import java.util.Scanner;

public class DesafioTabuadaComDoEWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int tab = entrada.nextInt();
        String resp = "";
        int cont = 1;

        do {

            System.out.println(tab + " x " + cont + " = " + (tab * cont));

            System.out.println("Deseja continuar (S ou N)?");
            resp = entrada.next();
            cont ++;
        }
        while (resp.equalsIgnoreCase("s"));
        }
    }
