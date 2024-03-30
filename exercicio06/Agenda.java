import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    List<Contato> contatos = new ArrayList<>();
    Scanner leitor = new Scanner(System.in);

    public void addContato(String nome, String telefone) {
        Contato contato = new Contato(nome, telefone);
        contatos.add(contato);
    }

    public void removerContato(String nome) {

        boolean encontrado = false;
        for (int i = 0; i < contatos.size(); i++) {
            Contato contato = contatos.get(i);
            if (contato.getNome().equals(nome)) {
                contatos.remove(i);
                encontrado = true;
                System.out.println("Contato removido.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contato nao encontrado.");
        }

    }

    public void buscarContato(String nome) {

        boolean encontrado = false;
        for (int i = 0; i < contatos.size(); i++) {
            Contato contato = contatos.get(i);
            if (contato.getNome().equals(nome)) {
                encontrado = true;
                System.out.println("Contato encontrado.");
                System.out.println("Nome: " + contato.getNome() + ", telefone: " + contato.getTelefone());
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contato nao encontrado.");
        }
        
    }
}