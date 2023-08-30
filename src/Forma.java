import java.util.ArrayList;

abstract class Forma {
    static private ArrayList<Forma> formasCadastradas = new ArrayList<>();

    abstract double calcularPerimetro();

    abstract double calcularArea();

    public void adicionarFormaNaLista() {
        formasCadastradas.add(this);
    }

    public static ArrayList<Forma> getFormasCadastradas() {
        return formasCadastradas;
    }

    @Override
    public String toString() {
        if (this instanceof Retangulo) {
            return "Retangulo\n" +
                    "((Area: " + calcularArea() +
                    ")) ((Perimetro: " + calcularPerimetro() +
                    ")) ((Retangulo Lado 1: " + ((Retangulo) this).getQuadradoLado1() +
                    ")) ((Retangulo Lado 2: " + ((Retangulo) this).getQuadradoLado2() +
                    ")) \n";
        }
        if (this instanceof Quadrado) {
            return "Quadrado\n" +
                    "((Area: " + calcularArea() +
                    ")) ((Perimetro: " + calcularPerimetro() +
                    ")) ((Quadrado Lado 1: " + ((Quadrado) this).getQuadradoLado1() +
                    ")) \n";
        }
        if (this instanceof Circulo) {
            return "Circulo\n" +
                    "((Area: " + calcularArea() +
                    ")) ((Perimetro: " + calcularPerimetro() +
                    ")) ((Raio: " + ((Circulo) this).getRaio() +
                    ")) ((Diametro: " + ((Circulo) this).getRaio() * 2 +
                    ")) \n";
        }
        return "";
    }

}