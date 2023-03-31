public class Principalcâo {

    public static void main(String[] args) {

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
    }
}
