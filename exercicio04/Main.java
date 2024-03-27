import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Jogador> jogadores = new ArrayList<>();
        int op = 0;

        do {
            System.out.println("############################");
            System.out.println("## 1 - Criar perfil       ##");
            System.out.println("## 2 - Atualizar pts      ##");
            System.out.println("## 3 - Atualizar lvl      ##");
            System.out.println("## 4 - Mostrar jogadores  ##");
            System.out.println("## 5 - Sair               ##");
            System.out.println("############################");
            System.out.print("Digite codigo: ");
            op = leitor.nextInt();
            leitor.nextLine();
            switch (op) {
                case 1:
                    criarPerfil(leitor, jogadores);
                    break;
                case 2:
                    atualizarPts(leitor, jogadores);
                    break;
                case 3:
                    atualizarLvl(leitor, jogadores);
                    break;
                case 4:
                    mostrar(leitor, jogadores);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Codigo invalido");
            }
        } while (op != 5);

    }

    static void criarPerfil(Scanner leitor, List<Jogador> jogadores) {
        String nome;
        int pontuacao = 0;
        int nivel = 0;

        System.out.print("Nome: ");
        nome = leitor.nextLine();

        Jogador jogador = new Jogador(nome, pontuacao, nivel);
        jogadores.add(jogador);

        System.out.println("Perfil criado.");
    }

    static void atualizarPts(Scanner leitor, List<Jogador> jogadores) {

        int i = 1;
        int op = 0;
        int pts;
        System.out.println("Jogadores:");
        System.out.println("#########################");
        for (Jogador jogador : jogadores) {
            System.out.println(i + " - " + jogador.getNome());
            i++;
        }
        System.out.println("#########################");
        System.out.print("Digite codigo do jogador que deseja atualizar pontuacao: ");
        op = leitor.nextInt();
        leitor.nextLine();

        i = 1;
        for (Jogador jogador : jogadores) {
            if (op == i) {
                System.out.print("Informe nova pontuacao: ");
                pts = leitor.nextInt();
                leitor.nextLine();

                jogador.setPontos(pts);
                System.out.println(jogador.getNome() + " agora tem " + pts + " pontos.");
            }
            i++;
        }
    }

    static void atualizarLvl(Scanner leitor, List<Jogador> jogadores) {

        int i = 1;
        int op = 0;
        int lvl;
        System.out.println("Jogadores:");
        System.out.println("#########################");
        for (Jogador jogador : jogadores) {
            System.out.println(i + " - " + jogador.getNome());
            i++;
        }
        System.out.println("#########################");
        System.out.print("Digite codigo do jogador que deseja atualizar nivel: ");
        op = leitor.nextInt();
        leitor.nextLine();

        i = 1;
        for (Jogador jogador : jogadores) {
            if (op == i) {
                System.out.print("Informe novo nivel: ");
                lvl = leitor.nextInt();
                leitor.nextLine();

                jogador.setNivel(lvl);
                System.out.println(jogador.getNome() + " agora esta no nivel " + lvl + ".");
            }
            i++;
        }
    }

    static void mostrar(Scanner leitor, List<Jogador> jogadores) {
        int i = 1;
        System.out.println("Jogadores:");
        for (Jogador jogador : jogadores) {
            System.out.println(i + " - Nome: " + jogador.getNome() + ", Pts: " + jogador.getPontos() + ", Nivel: " + jogador.getNivel());
            i++;
        }
    }
}