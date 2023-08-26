public class Equilatero extends Triangulo{

    public Equilatero(double trianguloLado1, double trianguloLado2, double trianguloLado3) {
        super(trianguloLado1, trianguloLado2, trianguloLado3);
    }

    @Override
    double calcularPerimetro() {
        return 3*trianguloLado1;
    }

    @Override
    double calcularArea() {
        return (Math.sqrt(3)/4)*Math.pow(trianguloLado1, 2);
    }

    @Override
    public String toString() {
        return "Equilatero{} " + super.toString();
    }
}
