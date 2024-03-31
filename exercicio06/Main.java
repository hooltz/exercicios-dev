import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int op = 0;

        do {
            System.out.println("[1] Adicionar contato");
            System.out.println("[2] Remover contato");
            System.out.println("[3] Buscar contato");
            System.out.println("[4] Sair");

            System.out.print("Digite opcao: ");
            op = leitor.nextInt();
            leitor.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Informe nome: ");
                    String nome = leitor.nextLine();
                    System.out.print("Informe telefone: ");
                    String telefone = leitor.nextLine();
                    agenda.addContato(nome, telefone);
                    break;
                case 2:
                    System.out.print("Nome do contato a ser removido: ");
                    nome = leitor.nextLine();
                    agenda.removerContato(nome);
                    break;
                case 3:
                    System.out.print("Nome do contato: ");
                    nome = leitor.nextLine();
                    agenda.buscarContato(nome);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Codigo invalido.");
                    break;
            }
        } while (op != 4);
    }
}
