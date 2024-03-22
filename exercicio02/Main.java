import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Livro> biblioteca = new ArrayList<Livro>();

        int opcao = 0;

        do {
            System.out.println("#########################");
            System.out.println("## 1 - Adicionar livro ##");
            System.out.println("## 2 - Listar livros   ##");
            System.out.println("## 3 - Sair            ##");
            System.out.println("#########################");
            System.out.print("Digite opcao: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao < 1 || opcao > 3) {
                System.out.println("Opcao invalida.");
            }
            if (opcao == 1) {
                System.out.print("Titulo: ");
                String titulo = leitor.nextLine();
                System.out.print("Autor: ");
                String autor = leitor.nextLine();
                System.out.print("Ano: ");
                int ano = leitor.nextInt();

                Livro livro = new Livro(titulo, autor, ano);
                biblioteca.add(livro);
            }
            if (opcao == 2) {
                for (Livro livro : biblioteca) {
                    livro.exibirInfo();
                }
            }
        } while (opcao != 3);

    }

}
