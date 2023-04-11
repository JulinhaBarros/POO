import java.util.Scanner;

public class DesafioMediaAlunos1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome1 = entrada.next();

        System.out.println("Digite a nota do aluno: ");
        float nota1 = entrada.nextFloat();

        System.out.println("Digite o nome do aluno: ");
        String nome2 = entrada.next();

        System.out.println("Digite a nota do aluno: ");
        float nota2 = entrada.nextFloat();

        System.out.println("Digite o nome do aluno: ");
        String nome3 = entrada.next();

        System.out.println("Digite a nota do aluno: ");
        float nota3 = entrada.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        if (nota1 > media) {
            System.out.println("Parabéns " + nome1);
        }
        else if (nota1 > 5 && nota1 < 6) {
            System.out.println("Você está de exame");
        }
        else {
            System.out.println(" Reprovado");
        }

        if (nota2 > media) {
            System.out.println("Parabéns " + nome1);
        }
        else if (nota2 > 5 && nota2 < 6) {
            System.out.println("Você está de exame");
        }
        else {
            System.out.println(" Reprovado");
        }

        if (nota3 > media) {
            System.out.println("Parabéns " + nome1);
        }
        else if (nota3 > 5 && nota3 < 6) {
            System.out.println("Você está de exame");
        }
        else {
            System.out.println(" Reprovado");
        }
    }
}
