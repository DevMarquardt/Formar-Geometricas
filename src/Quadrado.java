public class Quadrado extends Forma {
    double quadradoLado1;

    public Quadrado(double quadradoLado1) {
        this.quadradoLado1 = quadradoLado1;
    }

    @Override
    double calcularPerimetro() {
        return  quadradoLado1*4;
    }

    @Override
    double calcularArea() {
        return Math.pow(quadradoLado1, 2);
    }
}
