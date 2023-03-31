import javax.swing.*;

public class ESmodoGrafico {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Hello World");

        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        int idade = Integer.parseInt(
                JOptionPane.showInputDialog("Digite sua idade: "));

        JOptionPane.showMessageDialog(null, "Olá " + nome + " você tem" + idade + " anos");


    }
}
