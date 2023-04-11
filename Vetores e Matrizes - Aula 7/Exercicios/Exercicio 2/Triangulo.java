public class Triangulo {

    public static void main(String[] args) {

        AreaTriangulo t = new AreaTriangulo();

        t.base = 2;
        t.altura = 4;

        double calculo = (t.base) * (t.altura) / 2;

        System.out.println(" A área do triângulo de base " + t.base + " e com altura "
        + t.altura + " é igual a " + calculo);
    }
}
