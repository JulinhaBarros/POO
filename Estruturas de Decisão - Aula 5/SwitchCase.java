public class SwitchCase {

    public static void main(String[] args) {

        /*String tipoCabelo = "branco";

        switch (tipoCabelo) {
            case "amarelo":
                System.out.println("Você é loiro");
                break;

            case "preto":
                System.out.println("Você é moreno");
                break;

            case "vermelho":
                System.out.println("Você é ruivo");
                break;

            case "branco":
                System.out.println("Você é velho");
                break;

            default:
                System.out.println("Cor de cabelo indisponível");
        }*/

        int nota = 6;

        switch (nota) {
            case 0, 1, 2:
                System.out.println("Reprovado");
                break;

            case 3, 4, 5:
                System.out.println("Recuperação");
                break;

            case 6, 7:
                System.out.println("Na média");
                break;

            case 8, 9, 10:
                System.out.println("Aprovado");
                break;

            default:
                System.out.println("Valor inválido");
        }

    }
}
