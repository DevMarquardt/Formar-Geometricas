public class Escaleno extends Triangulo {

    public Escaleno(double trianguloLado1, double trianguloLado2, double trianguloLado3) {
        super(trianguloLado1, trianguloLado2, trianguloLado3);
        adicionarFormaNaLista();
    }

    public double calcularSemiPerimetro() {
        return calcularPerimetro() / 2;
    }

    @Override
    double calcularPerimetro() {
        return getTrianguloLado1() + getTrianguloLado2() + getTrianguloLado3();
    }

    @Override
    double calcularArea() {
        return Math.sqrt(calcularSemiPerimetro() * (calcularSemiPerimetro() - getTrianguloLado1()) * (calcularSemiPerimetro() - getTrianguloLado2()) * (calcularSemiPerimetro() - getTrianguloLado3()));
    }
}