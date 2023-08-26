import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Professor professor = new Professor("123");
    static Forma formas;
    static Circulo circulo;

    public static void main(String[] args) {
            iniciarAplicacao();
    }

    private static void iniciarAplicacao() {
        menuLogin();
        menuSelecionarFuncionalidade();

    }

    private static void menuLogin() {
        int numeroTentivas=1;
        String senhaInput;
        System.out.println("""
                Seja bem-vindo Professor
                Por favor, insira sua senha
                >""");

        senhaInput = sc.next();
        do {
            numeroTentivas++;
            if(!senhaInput.equals(professor.senha)){
                System.out.println("Senha incorreta, digite novamente");
                System.out.print(">");
                senhaInput = sc.next();
            }
            if (numeroTentivas==3){
                System.exit(0);
            }
        }while(!senhaInput.equals(professor.senha));
    }

    private static void menuSelecionarFuncionalidade() {
        int funcionalidade;
        System.out.println("""
                Selecione a opção desejada
                1 - Cadastrar forma
                2 - Listar formas
                3 - Logout
                >""");
        funcionalidade = sc.nextInt();
        switch (funcionalidade){
            case 1:
                cadastrarForma();
                break;
            case 2:
                listarFormas();
                break;
            case 3:

        }
    }
    private static void cadastrarForma(){
        int opcaoCadastrarForma;
        System.out.println("""
                1 - Círculo
                2 - Triângulo
                3 - Retângulo
                4 - Quadrado
                >""");
        opcaoCadastrarForma = sc.nextInt();
        switch (opcaoCadastrarForma){
            case 1:
                System.out.println("Digite o raio do circulo");
                System.out.print(">");
                int raio = sc.nextInt();
                new Circulo(raio);
                formas.

        }
    }
    private static void listarFormas(){
    }
}
