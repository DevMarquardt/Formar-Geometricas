abstract class Triangulo extends Forma {
    private double trianguloLado1;
    private double trianguloLado2;
    private double trianguloLado3;

    public Triangulo(double trianguloLado1, double trianguloLado2, double trianguloLado3) {
        this.trianguloLado1 = trianguloLado1;
        this.trianguloLado2 = trianguloLado2;
        this.trianguloLado3 = trianguloLado3;
    }

    public double getTrianguloLado1() {
        return trianguloLado1;
    }

    public double getTrianguloLado2() {
        return trianguloLado2;
    }

    public double getTrianguloLado3() {
        return trianguloLado3;
    }

    public static void definirTipoDeTriangulo(double trianguloLado1, double trianguloLado2, double trianguloLado3) {
        if (trianguloLado1 == trianguloLado2 && trianguloLado2 == trianguloLado3) {
            new Equilatero(trianguloLado1, trianguloLado2, trianguloLado3);
        } else if (trianguloLado1 == trianguloLado2 || trianguloLado2 == trianguloLado3 || trianguloLado3 == trianguloLado1) {
            new Isosceles(trianguloLado1, trianguloLado2, trianguloLado3);
        } else {
            new Escaleno(trianguloLado1, trianguloLado2, trianguloLado3);
        }
    }

    @Override
    public String toString() {
        return "Triangulo\n" +
                "((Tipo de Triangulo: " + getClass() +
                ")) ((Area: " + calcularArea() +
                ")) ((Perimetro: " + calcularPerimetro() +
                ")) ((Triangulo Lado 1: " + trianguloLado1 +
                ")) ((Triangulo Lado 2: " + trianguloLado2 +
                ")) ((Triangulo Lado 3: " + trianguloLado3 +
                ")) " + super.toString() +
                "\n";
    }
}