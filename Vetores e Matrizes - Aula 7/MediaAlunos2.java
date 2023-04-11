import java.util.Scanner;

public class MediaAlunos2 {

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

        float[] notas = {nota1, nota2, nota3};
        String[] nomes = {nome1, nome2, nome3};

        for (int i = 0; i < notas.length; i ++) {
            if (notas[i] > media) {
                System.out.println("Parabéns " + nomes[i] + " !");
            }
        }
    }
}
