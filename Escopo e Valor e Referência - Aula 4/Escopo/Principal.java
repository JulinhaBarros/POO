package Escopo;

public class Principal {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();

        double bolsaFamilia = 0;

        p1.nome = "João";
        p1.idade = 15;
        p1.renda = 1000.00;

      //  Pessoa p2 = new Pessoa("Maria", 25, 750.00)

        if(p1.renda <= 1000) {
            bolsaFamilia = p1.renda * 0.5;
            // p1.renda = p1.renda + aumento;
            p1.renda += bolsaFamilia;
        }
            System.out.println("Valor da renda de "+ p1.nome + " é: "+ p1.renda);
            System.out.println("Valor do aumento recebido: " +bolsaFamilia);

    }
}
