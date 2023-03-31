public class clientePrincipal {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.nome = "Julia";
        cliente.cpf = "123.456.789-10";
        cliente.idade = 19;

        System.out.println("Nome: " + cliente.nome);
        System.out.println("Idade: " + cliente.idade);
        System.out.println("CPF: " + cliente.cpf + "\n");


        Curso curso = new Curso();

        curso.nomeCurso = "Ciência da Computação";
        curso.tempoCurso= 4;
        curso.rgm = 30127874;


        System.out.println("Nome: " + curso.nomeCurso);
        System.out.println("Duração do Curso: " + curso.tempoCurso);
        System.out.println("RGM: " + curso.rgm + "\n");


        System.out.println(cliente.nome + " está fazendo " + curso.nomeCurso);

    }
}
