//package Exercicios;
public class Funcinario {

    int cracha;
    float salario;
    String cargo;

    public Funcinario () {

        this.cargo = "assistente";
    }

    public Funcinario (int cracha, float salario, String cargo) {

        this.cracha = cracha;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void calcularAumento(float porcentagem) {

        float aum = salario;
        float porc = salario * porcentagem / 100;
        float SN = salario + porc;

        System.out.println("Salário Inicial: " + aum);
        System.out.println("Total acrecido: " + porc);
        System.out.println("Salário com aumento: " + SN);

        System.out.println();

    }

    public void calculaAumento(int tempo) {

        float aum1 = salario;
        float aum2 = tempo * 150;
        float Novo = salario + aum2;

        System.out.println("Salário Inicial: " + aum1);
        System.out.println("Total do valor acrescido: " + aum2);
        System.out.println("Salário com aumento por anos trabalhados: " + Novo);

    }

    public int getCracha() {
        return cracha;
    }

    public void setCracha (int cracha) {
        this.cracha = cracha;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo () {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void exibeDados () {

        System.out.println("\nCrachá: " + cracha);
        System.out.println("Salário: " + salario);
        System.out.println("Cargo: " + cargo);

        System.out.println();
    }
}


