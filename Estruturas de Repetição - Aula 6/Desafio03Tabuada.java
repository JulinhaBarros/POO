import java.util.Scanner;

public class Desafio03Tabuada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite qual tabuada quer saber?: ");
        int tab = entrada.nextInt();
        System.out.println(" Até qual número deseja calcular?");
        int tab2 = entrada.nextInt();
        //String resp = "";
        int cont = 1;

        while (cont <= tab2) {
            System.out.println (tab + " x " + cont + " = " + (tab * cont));
            cont ++;
        }
    }
}
