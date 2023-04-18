import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int a = leia.nextInt();
        System.out.println("Digite um número: ");
        int b = leia.nextInt();
        System.out.println("Digite um número: ");
        int c = leia.nextInt();

        System.out.println("Valores lidos: " + "\n" + a  + "\n" + b + "\n" + c);

        int[] vetor = {a,b,c};

        int[] n = new int[3];
        int tv = 3 - 1;

        System.out.println("Valores lidos em ordem decrescente: ");
        for( int i = 0; i < 3; i++){
            n[i] = vetor[tv - i];

            System.out.println(n[i] + " ");

        }

        int[] aux = new int[vetor.length];

        for(int i = 0; i < vetor.length; i++) {
            aux[i] = vetor[i];
        }

        for(int i = 0; i < aux.length; i++) {
            for(int j = i + 1; j < aux.length; j++) {
                if(aux[j] < aux[i]) {
                    int temp = aux[i];
                    aux[i] = aux[j];
                    aux[j] = temp;
                }
            }
        }

        System.out.println("Valores em ordem crescente: ");
        for(int i = 0; i < aux.length; i++) {
            System.out.println(aux[i] + " ");
        }

        }

    }

