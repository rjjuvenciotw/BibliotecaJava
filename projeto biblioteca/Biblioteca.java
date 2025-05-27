import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Biblioteca{
    private static List<Livro> livros = new ArrayList<>();
    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Emprestimo> emprestimos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int proximoNumeroEmprestimo = 1;
}
    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- Sistema de Biblioteca ---");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Cadastrar Usuário");
            System.out.println("3. Consultar Disponibilidade de Livro");
            System.out.println("4. Realizar Empréstimo");
            System.out.println("5. Realizar Devolução");
            System.out.println("6. Listar Livros");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1: cadastrarLivro(); break;
                case 2: cadastrarUsuario(); break;
                case 3: consultarDisponibilidade(); break;
                case 4: realizarEmprestimo(); break;
                case 5: realizarDevolucao(); break;
                case 6: listarLivros(); break;
                case 0: System.out.println("Saindo do sistema."); break;
                default: System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        scanner.close();


    public static void cadastrarLivro(){
        System.out.println("------ Cadastro de Livro -------");

        System.out.println("Titulo: ");
        String titulo = scanner.nextLine();

        System.out.println("Autor ");
        Sting autor = scanner.nestLine();

        System.out.println("Ano: ")
        int ano = scanner.nestLine();

        System.out.println("Genero: ");
        



    }

    }