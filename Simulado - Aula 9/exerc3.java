import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num;
        int qLidos = 0;
        int soma = 0;
        int qPositivo = 0;
        int qNegativos = 0;

    do {
        System.out.print("Informe um número inteiro (0 para sair): ");
        num = Integer.parseInt(entrada.nextLine());

        if (num > 0) {
             qPositivo += num;
        } else if (num < 0) {
            qNegativos += num;
        }
    }while (num != 0);

    int somaTotal = qPositivo + qNegativos;

        System.out.println(qPositivo);
        System.out.println(qNegativos);
        System.out.println(soma);

        }

    }



