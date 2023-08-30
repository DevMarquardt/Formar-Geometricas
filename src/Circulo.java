public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
        adicionarFormaNaLista();
    }

    public double getRaio() {
        return raio;
    }

    @Override
    double calcularPerimetro() {
        return Math.PI * 2 * this.getRaio();
    }

    @Override
    double calcularArea() {
        return Math.PI * Math.pow(getRaio(), 2);
    }

}