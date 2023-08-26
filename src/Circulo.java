public class Circulo extends Forma {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double calcularPerimetro() {
        return Math.PI*2* this.raio;
    }

    @Override
    double calcularArea() {
        return Math.PI*Math.pow(raio, 2);
    }
}
