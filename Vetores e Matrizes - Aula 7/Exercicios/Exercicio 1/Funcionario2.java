import java.util.Scanner;

public class Funcionario2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Funcinario f = new Funcinario();

        System.out.println("Digite o número do seu crachá: ");
        f.setCracha(entrada.nextInt());

        System.out.println("Digite o seu salário: ");
        f.setSalario(entrada.nextInt());

        System.out.println("Digite seu cargo: ");
        f.setCargo(entrada.next());

        f.exibeDados();

        /* OU:

         System.out.println("Dados do funcionário: \n" + "Número do Crachá: " + f.getCracha() + "\n" + "Salário: " +
         f.getSalario() + "\n" + "Cargo: " + f.getCargo());

        */
    }
}
