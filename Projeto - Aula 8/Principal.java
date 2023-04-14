import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        ArrayList<Pessoa> clientes = new ArrayList<Pessoa>();
        ArrayList<Banco> contas = new ArrayList<Banco>();

        int escolha = 0;
        boolean executar = true;
        while (executar) {
            System.out.println("Escolha uma ação: " + "\n" +
                    "1 - Cadastrar cliente \n" + "2 - Cadastrar conta \n" + "3 - Consultar saldo \n" + "4 - Exibir Contas \n" +
                    "5 - Sacar dinheiro \n" + "6 - Depositar dinheiro \n" + "7 - Sair \n");

            escolha = entrada.nextInt();



            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = entrada.next();
                    System.out.print("Digite o CPF do cliente: ");
                    String cpf = entrada.next();
                    Pessoa novoCliente = new Pessoa(nome, cpf);
                    clientes.add(novoCliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o número da conta: ");
                    int numConta = entrada.nextInt();
                    System.out.print("Digite o saldo inicial da conta: ");
                    double saldo = entrada.nextDouble();
                    System.out.print("Digite o CPF do titular da conta: ");
                    String cpfTitular = entrada.next();
                    Pessoa titular = null;
                    for (Pessoa cliente : clientes) {
                        if (cliente.getCpf().equals(cpfTitular)) {
                            titular = cliente;
                            break;
                        }
                    }
                    if (titular == null) {
                        System.out.println("CPF do titular não encontrado!");
                    } else {
                        Banco novaConta = new Banco(titular, numConta, saldo);
                        contas.add(novaConta);
                        System.out.println("Conta cadastrada com sucesso!");
                    }
                    break;
                case 3:
                    System.out.print("Digite o número da conta: ");
                    int contaConsulta = entrada.nextInt();
                    boolean encontrou = false;
                    for (Banco conta : contas) {
                        if (conta.getNumeroDaConta() == contaConsulta) {
                            System.out.println("Saldo da conta " + contaConsulta + ": " + conta.getSaldo());
                            encontrou = true;
                            break;
                        }
                    }
                    if (!encontrou) {
                        System.out.println("A conta informada não existe!");
                    }
                    break;
                case 4:
                    for (Banco conta : contas) {
                        System.out.println(conta);
                    }
                    break;
                case 5:
                    System.out.println("Digite o número da conta:");
                    int numeroContaSaque = entrada.nextInt();
                    Banco contaSaque = null;
                    for (Banco banco : contas) {
                        if (banco.getNumeroDaConta() == numeroContaSaque) {
                            contaSaque = banco;
                            break;
                        }
                    }
                    if (contaSaque == null) {
                        System.out.println("A conta informada não existe");
                    } else {
                        System.out.println("Digite o valor a ser sacado:");
                        double valorSaque = entrada.nextDouble();
                        if (contaSaque.getSaldo() >= valorSaque) {
                            contaSaque.setSaldo((float) (contaSaque.getSaldo() - valorSaque));
                            System.out.println("Saque realizado com sucesso!");
                            System.out.println("Saldo atual da conta " + contaSaque.getNumeroDaConta() + ": R$ " + contaSaque.getSaldo());
                        } else {
                            System.out.println("Saldo insuficiente");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Digite o número da conta:");
                    int numeroContaDeposito = entrada.nextInt();
                    Banco contaDeposito = null;
                    for (Banco banco : contas) {
                        if (banco.getNumeroDaConta() == numeroContaDeposito) {
                            contaDeposito = banco;
                            break;
                        }
                    }
                    if (contaDeposito == null) {
                        System.out.println("A conta informada não existe");
                    } else {
                        System.out.println("Digite o valor a ser depositado:");
                        double valorDeposito = entrada.nextDouble();
                        contaDeposito.setSaldo((float) (contaDeposito.getSaldo() + valorDeposito));
                        System.out.println("Depósito realizado com sucesso!");
                        System.out.println("Saldo atual da conta " + contaDeposito.getNumeroDaConta() + ": R$ " + contaDeposito.getSaldo());
                    }
                    break;
                case 7:
                    entrada.close();
                    break;

                default:
                    System.out.println("Operação inválida");
                    break;
            }

        }
    }
}
