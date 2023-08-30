public class Retangulo extends Forma {
    private double quadradoLado1;
    private double quadradoLado2;

    public Retangulo(double quadradoLado1, double quadradoLado2) {
        this.quadradoLado1 = quadradoLado1;
        this.quadradoLado2 = quadradoLado2;
        adicionarFormaNaLista();
    }

    public double getQuadradoLado1() {
        return quadradoLado1;
    }

    public double getQuadradoLado2() {
        return quadradoLado2;
    }

    @Override
    double calcularPerimetro() {
        return 2 * (quadradoLado1 + quadradoLado2);
    }

    @Override
    double calcularArea() {
        return quadradoLado1 * quadradoLado2;
    }
}