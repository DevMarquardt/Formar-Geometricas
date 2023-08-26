public class Escaleno extends Triangulo{

    public Escaleno(double trianguloLado1, double trianguloLado2, double trianguloLado3) {
        super(trianguloLado1, trianguloLado2, trianguloLado3);
    }

    private double calcularSemiPerimetro(){
        return calcularPerimetro()/2;
    }

    @Override
    double calcularPerimetro() {
        return trianguloLado1+trianguloLado2+trianguloLado3;
    }

    @Override
    double calcularArea() {
        return Math.sqrt(calcularSemiPerimetro()*(calcularSemiPerimetro()-trianguloLado1)*(calcularSemiPerimetro()-trianguloLado2)*(calcularSemiPerimetro()-trianguloLado1));
    }

    @Override
    public String toString() {
        return "Escaleno{} " + super.toString();
    }
}
