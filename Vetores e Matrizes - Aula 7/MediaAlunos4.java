import java.util.ArrayList;
import java.util.Scanner;

public class MediaAlunos4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        int escolha = 0;

        do {
            System.out.println("Digite o nome do aluno: ");
            String nome = entrada.next();

            System.out.println("Digite a nota do aluno: ");
            float nota = entrada.nextFloat();

            alunos.add(new Aluno(nome, nota));

            System.out.println("Para cadastrar as notas de outro aluno \n" + "Digite 1\n" + "Para parar digite 0");
            escolha = entrada.nextInt();
        }
        while (escolha !=0);

        for (int i = 0; i < alunos.size(); i ++) {

            System.out.println("Nome: " + alunos.get(i).nome + "\n" + alunos.get(i).nota);
        }
    }
}
