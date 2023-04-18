import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int mSim = 0;
        int fNao = 0;
        int totalS = 0;
        int totalN = 0;

        for (int i = 0; i <= 3; i++) {
            System.out.println("Informe seu genero? M/F");
            char g = leia.nextLine().charAt(0);
            System.out.println("Sua resposta para a pesquisa: S/N");
            String resp = leia.nextLine();


            if (g == 'M' && resp.equalsIgnoreCase("S")) {
                mSim++;
            }
            if (g == 'F' && resp.equalsIgnoreCase("N")) {
                fNao++;
            }
            if (resp.equalsIgnoreCase("S")) {
                totalS++;
            }
            if (resp.equalsIgnoreCase("N")) {
                totalN++;
            }
        }
        System.out.println("Quantidade de pessoas do sexo masculino que responderam 'SIM': "+mSim);
        System.out.println("Quantidade de pessoas do sexo feminino que responderam 'NÃO': "+fNao);
        System.out.println("Quantidade total de pessoas que responderam 'SIM': "+totalS);
        System.out.println("Quantidade total de pessoas que responderam 'NÃO': "+totalN);

        leia.close();

    }
}
