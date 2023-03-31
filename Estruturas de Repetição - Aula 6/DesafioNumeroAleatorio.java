import java.util.Random;
import java.util.Scanner;

public class DesafioNumeroAleatorio {

    public static void main(String[] args) {


        Random aleatório = new Random();
        int num = aleatório.nextInt(20);

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int escolhido = leia.nextInt();


        while (num != escolhido) {

            if (escolhido > num) {
                System.out.println("O número sorteado é maior que o sorteado");
            }
            else {
                System.out.println("O número sorteado é menor que o sorteado");
            }
            System.out.println("Tente novamente");
            escolhido = leia.nextInt();
        }
    }
}
