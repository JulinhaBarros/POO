import java.util.Scanner;

public class MediaAlunos3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float[] notas = new float[10];
        String[] nomes = new String[10];
        float soma = 0.0f;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome do aluno: ");
            nomes[i] = entrada.next();

            System.out.println("Digite a nota do aluno " + nomes[i] + ": ");
            notas[i] = entrada.nextFloat();

            soma += notas[i];
        }

        float media = soma / 10;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("Parabéns " + nomes[i] + " !");
            }
        }
    }
}
