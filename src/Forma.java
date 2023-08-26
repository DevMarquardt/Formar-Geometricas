import java.util.ArrayList;

abstract class Forma {
    ArrayList <Forma> formasCadastradas = new ArrayList<>();

    abstract double calcularPerimetro();
    abstract double calcularArea();

    private void adicionarFormaNaLista(){
        formasCadastradas.add(this);
    }
    @Override
    public String toString() {
        return "Forma{" +
                "formasCadastradas=" + formasCadastradas +
                "area: " + calcularArea() +
                "perimetro: " + calcularPerimetro() +
                '}';
    }

}
