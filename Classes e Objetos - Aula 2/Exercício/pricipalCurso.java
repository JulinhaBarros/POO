public class pricipalCurso {

    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.nomeCurso = "Ciência da Computação";
        curso.tempoCurso= 4;
        curso.rgm = 30127874;


        System.out.println("Nome: " + curso.nomeCurso);
        System.out.println("Duração do Curso: " + curso.tempoCurso);
        System.out.println("RGM: " + curso.rgm + "\n");

    }
}
