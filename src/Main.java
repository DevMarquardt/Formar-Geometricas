import java.util.Scanner;

public class Main {
    static private final Scanner sc = new Scanner(System.in);
    static private final Professor professor = new Professor("123");

    public static void main(String[] args) {
        iniciarAplicacao();
    }

    private static void iniciarAplicacao() {
        menuLogin();
        menuSelecionarFuncionalidade();

    }

    private static void menuLogin() {
        int numeroTentivas = 1;
        String senhaInput;
        System.out.println("""
                Seja bem-vindo Professor
                Por favor, insira sua senha
                >""");

        senhaInput = sc.next();
        do {
            numeroTentivas++;
            if (!senhaInput.equals(professor.getSenha())) {
                System.out.println("Senha incorreta, digite novamente");
                System.out.print(">");
                senhaInput = sc.next();
            }
            if (numeroTentivas == 3) {
                System.exit(0);
            }
        } while (!senhaInput.equals(professor.getSenha()));
    }

    private static void menuSelecionarFuncionalidade() {
        int funcionalidade;
        do {
            System.out.println("""
                    Selecione a opção desejada
                    1 - Cadastrar forma
                    2 - Listar formas
                    3 - Logout
                    >""");
            funcionalidade = sc.nextInt();
            switch (funcionalidade) {
                case 1:
                    cadastrarForma();
                    break;
                case 2:
                    listarFormas();
                    break;
                case 3:
                    iniciarAplicacao();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (funcionalidade != 3);
    }

    private static void cadastrarForma() {
        int opcaoCadastrarForma;
        do {
            System.out.println("""
                    1 - Círculo
                    2 - Triângulo
                    3 - Retângulo
                    4 - Quadrado
                    5 - Voltar
                    >""");
            opcaoCadastrarForma = sc.nextInt();
            switch (opcaoCadastrarForma) {
                case 1:
                    cadastrarCirculo();
                    break;
                case 2:
                    cadastrarTriangulo();
                    break;
                case 3:
                    cadastrarRetangulo();
                    break;
                case 4:
                    cadastrarQuadrado();
                    break;
                case 5:
                    menuSelecionarFuncionalidade();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcaoCadastrarForma != 5);

    }

    private static void cadastrarQuadrado() {
        System.out.println("Insira o lado do quadrado");
        System.out.print("> ");
        double lado1 = sc.nextDouble();
        new Quadrado(lado1);
    }

    private static void cadastrarRetangulo() {
        System.out.println("Insira o lado 1 do retangulo");
        System.out.print("> ");
        double retanguloLado1 = sc.nextDouble();
        System.out.println("Insira o lado 2 do retangulo");
        System.out.print("> ");
        double retanguloLado2 = sc.nextDouble();
        new Retangulo(retanguloLado1, retanguloLado2);
    }

    private static void cadastrarTriangulo() {
        System.out.println("Insira o lado 1 do triangulo");
        System.out.print("> ");
        double lado1 = sc.nextDouble();
        System.out.println("Insira o lado 2 do triangulo");
        System.out.print("> ");
        double lado2 = sc.nextDouble();
        System.out.println("Insira o lado 3 do triangulo");
        System.out.print("> ");
        double lado3 = sc.nextDouble();
        Triangulo.definirTipoDeTriangulo(lado1, lado2, lado3);
    }

    private static void cadastrarCirculo() {
        double raio = 0;
        System.out.println("Insira o raio do círculo");
        raio = sc.nextDouble();
        new Circulo(raio);
    }

    private static void listarFormas() {
        System.out.println("Quais formas você deseja listar?");
        System.out.println("""
                1 - Triângulos
                2 - Retângulos
                3 - Quadrados
                4 - Círculos
                5 - Todas as formas
                6 - Voltar
                >""");
        int opcaoListarFormas = sc.nextInt();
        switch (opcaoListarFormas) {
            case 1:
                listarTriangulos();
                break;
            case 2:
                listarRetangulos();
                break;
            case 3:
                listarQuadrados();
                break;
            case 4:
                listarCirculos();
                break;
            case 5:
                listarTodasAsFormas();
                break;
            case 6:
                menuSelecionarFuncionalidade();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    private static void listarTriangulos() {
        for (Forma forma : Forma.getFormasCadastradas()) {
            if (forma instanceof Triangulo) {
                System.out.println(forma);
            }
        }
    }

    private static void listarRetangulos() {
        for (Forma forma : Forma.getFormasCadastradas()) {
            if (forma instanceof Retangulo) {
                System.out.println(forma);
            }
        }
    }

    private static void listarQuadrados() {
        for (Forma forma : Forma.getFormasCadastradas()) {
            if (forma instanceof Quadrado) {
                System.out.println(forma);
            }
        }
    }

    private static void listarCirculos() {
        for (Forma forma : Forma.getFormasCadastradas()) {
            if (forma instanceof Circulo) {
                System.out.println(forma);
            }
        }
    }

    private static void listarTodasAsFormas() {
        for (Forma forma : Forma.getFormasCadastradas()) {
            System.out.println(forma);

        }
    }

}