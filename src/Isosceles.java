public class Isosceles extends Triangulo{
    double ladoDiferente;
    double ladoIgual;
    public Isosceles(double trianguloLado1, double trianguloLado2, double trianguloLado3) {
        super(trianguloLado1, trianguloLado2, trianguloLado3);
        if (trianguloLado1 == trianguloLado2){
            ladoDiferente = trianguloLado3;
            ladoIgual = trianguloLado1;
        }
        if (trianguloLado2 == trianguloLado3){
            ladoDiferente = trianguloLado1;
            ladoIgual = trianguloLado2;

        }
        if (trianguloLado3 == trianguloLado1){
            ladoDiferente = trianguloLado2;
            ladoIgual = trianguloLado3;
        }
    }

    @Override
    double calcularArea() {
        return (ladoDiferente*calcularAltura())/2;
    }

    @Override
    double calcularPerimetro() {
        return (ladoDiferente+2)*ladoIgual;
    }


    private double calcularAltura(){
        return Math.sqrt(Math.pow(ladoIgual, 2)-(Math.pow(ladoIgual, 2)/4));
    }

    @Override
    public String toString() {
        return "Isosceles{} " + super.toString();
    }
}
