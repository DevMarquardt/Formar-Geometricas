public class Equilatero extends Triangulo {

    public Equilatero(double trianguloLado1, double trianguloLado2, double trianguloLado3) {
        super(trianguloLado1, trianguloLado2, trianguloLado3);
        adicionarFormaNaLista();
    }

    @Override
    double calcularPerimetro() {
        return 3 * getTrianguloLado1();
    }

    @Override
    double calcularArea() {
        return (Math.sqrt(3) / 4) * Math.pow(getTrianguloLado1(), 2);
    }
}