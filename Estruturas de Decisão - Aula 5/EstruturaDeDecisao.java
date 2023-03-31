public class EstruturaDeDecisao {

    public static void main(String[] args) {

        /*int hora = 1;

        if (hora >= 6 && hora < 12) { //Se tiver apenas uma instrução, não é necessário colocar colchete, porém como pareço a Dory, deixarei, pois não interfere
            System.out.println("Bom dia!");
        }
        else if (hora >= 12 && hora < 18){
            System.out.println("Boa Tarde!");
        }
        if (hora >= 18 && hora < 23) {
            System.out.println("Boa Noite!");
        }
        else {
            System.out.println("Boa Madrugada!");
        }*/

        /*int idade = 19;

        if (idade >= 18) {
            System.out.println("Pode entrar!");
        }
        else {
            System.out.println("Não pode entrar!");
        }*/

        /*String mensagem = (idade >= 18) ? "Pode entrar!" : "Vaza!";
        System.out.println(mensagem);*/

        int idade = 60;
        char sexo = 'M';
        int tempo = 15;

        if (sexo == 'F' && idade >= 62 && tempo >= 15) {

            System.out.println("Pode se aposentar");
        }
        else if (sexo == 'M' && idade >= 65 && tempo >= 30) {

            System.out.println("Pde se aposentar");
        } else if (sexo == 'M' && idade >=57 && tempo >= 30) {

            System.out.println("pode se aposentar por contribuição");
        }
        else if (sexo == 'M' && idade >= 60 && tempo >= 35) {
            System.out.println("Pode se aposentar por tempo de contribuição");
        }
        else {
            System.out.println("Não pode se aposentar");
        }
    }
}
