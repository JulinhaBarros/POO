package Exercicio;

import java.util.Scanner;
/*package Exercicio;*/

public class paciente {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, informe os dados do paciente:  ");
        System.out.println("Nome: ");
        String nome = entrada.nextLine();
        System.out.println("RG: ");
        String rg = entrada.nextLine();
        System.out.println("Endereço: ");
        String endereco = entrada.nextLine();
        System.out.println("Telefone: ");
        String telefone = entrada.nextLine();
        System.out.println("Data de Nascimento: ");
        String dataNascimento = entrada.nextLine();
        System.out.println("Profissâo: ");
        String profissao = entrada.nextLine();

        Paciente01 paciente = new Paciente01();

        paciente.nome = nome;
        paciente.rg = rg;
        paciente.endereco = endereco;
        paciente.telefone = telefone;
        paciente.dataNascimento = dataNascimento;
        paciente.profissao = profissao;



        System.out.println("Dados do paciente: " + "\n" +
                "Nome: " + paciente.nome + "\n" +
                "Rg: " + paciente.rg + "\n" +
                "Endereço: " + paciente.endereco + "\n" +
                "Telefone: " + paciente.telefone + "\n" +
                "Data de Nascimento: " + paciente.dataNascimento + "\n" +
                "Profissão: " + paciente.profissao + "\n");

        }
    }
