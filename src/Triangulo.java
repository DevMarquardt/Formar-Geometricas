abstract class Triangulo extends Forma {
    double trianguloLado1;
    double trianguloLado2;
    double trianguloLado3;

    public Triangulo(double trianguloLado1, double trianguloLado2, double trianguloLado3) {
        this.trianguloLado1 = trianguloLado1;
        this.trianguloLado2 = trianguloLado2;
        this.trianguloLado3 = trianguloLado3;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "trianguloLado1=" + trianguloLado1 +
                ", trianguloLado2=" + trianguloLado2 +
                ", trianguloLado3=" + trianguloLado3 +
                "} " + super.toString();
    }
}
