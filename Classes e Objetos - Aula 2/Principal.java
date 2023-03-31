public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "João";
        pessoa.cpf = "123.456.789-10";
        pessoa.idade = 22;


        Pessoa pessoa2 = new Pessoa("Julia", 19 , "134.282.188-25");

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("CPF: " + pessoa.cpf + "\n");

        System.out.println("Nome: " + pessoa2.nome);
        System.out.println("Idade: " + pessoa2.idade);
        System.out.println("CPF: " + pessoa2.cpf);


        /*System.out.println("Nome:" + pessoa.nome + "\n" + "Idade: " + pessoa.idade "\n"+ "cpf" + pessoa.cpf);
        System.out.println("Nome:" + pessoa2.nome + "\n" + "Idade: " + pessoa2.idade "\n"+ "cpf" + pessoa2.cpf);*/


        Câo câo = new Câo();

        câo.nome = "Muttley";
        câo.raça = "lhasa";
        câo.idade = 11;
        câo.porte = "pequeno";
        câo.tipoPelo = "marrom";
        câo.sexo = "masculino";
        câo.vacina = true;

        System.out.println("Nome: " + câo.nome);
        System.out.println("Raça: " + câo.raça);
        System.out.println("Idade: " + câo.idade);
        System.out.println("Porte: " + câo.porte);
        System.out.println("Tipo de Pelo: " + câo.tipoPelo);
        System.out.println("Sexo: " + câo.sexo);
        System.out.println("Vacina: " + câo.vacina + "\n");



        System.out.println(pessoa2.nome + " é dona do " + câo.nome);



    }
}
