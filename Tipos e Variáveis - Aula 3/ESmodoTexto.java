import java.util.Scanner;

public class ESmodoTexto {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Por favor digite o seu nome: ");
        String nome = leia.nextLine(); // usado para texto
        System.out.println("Olá" + nome + " seja bem vindo(a)");

        System.out.println("Digite um número: ");
        int num1 = leia.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = leia.nextInt(); // usado para número
        int soma = num1 + num2;

        System.out.println("Os números digitados são: " + num1 + " e " + num2 + ". E a soma deles é igual a " + soma);


    }
}
