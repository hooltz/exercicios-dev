import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        List<Pedido> pedidos = new ArrayList<>();
        int opcao = 0;
        int codigo = 1;

        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza("Portuguesa", 30.0f, new String[]{"Queijo", "Presunto", "Ovo", "Azeitona"}));
        pizzas.add(new Pizza("Frango", 25.0f, new String[]{"Queijo", "Frango", "Milho", "Catupiry"}));
        pizzas.add(new Pizza("Calabresa", 28.0f, new String[]{"Queijo", "Calabresa", "Cebola", "Orégano"}));

        do {
            System.out.println(" ");
            System.out.println("[1] Novo pedido");
            System.out.println("[2] Listar pedidos");
            System.out.println("[3] Cancelar pedido");
            System.out.println("[4] Sair");
            System.out.println(" ");
            System.out.print("Digite opcao: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    int opcaoPizza;
                    String tamanho;
                    String endereco;

                    System.out.println(" ");
                    System.out.println("---NOVO PEDIDO---");
                    do {
                        System.out.println(" ");
                        System.out.println("Escolha a pizza: ");
                        for (int i = 0; i < pizzas.size(); i++) {
                            System.out.println("[" + (i + 1) + "] " + pizzas.get(i).getNome() + " - R$" + pizzas.get(i).getValor());
                        }
                        System.out.print("Selecione opcao:");
                        opcaoPizza = leitor.nextInt();
                        leitor.nextLine();
                        if (opcaoPizza < 1 || opcaoPizza > pizzas.size()) {
                            System.out.println("Opcao invalida.");
                        }
                    } while (opcaoPizza < 1 || opcaoPizza > pizzas.size());

                    do {
                        System.out.println(" ");
                        System.out.println("Escolha tamanho (P, M ou G): ");
                        tamanho = leitor.nextLine();
                        tamanho = tamanho.toUpperCase();
                        if (!tamanho.equals("P") && !tamanho.equals("M") && !tamanho.equals("G")) {
                            System.out.println("Tamanho invalido.");
                        }
                    } while (!tamanho.equals("P") && !tamanho.equals("M") && !tamanho.equals("G"));

                    System.out.print("Informe endereco: ");
                    endereco = leitor.nextLine();

                    Pedido pedido = new Pedido(codigo, pizzas.get(opcaoPizza - 1), tamanho, endereco);
                    pedidos.add(pedido);
                    codigo++;

                    break;
                case 2:
                    System.out.println(" ");
                    for (Pedido p : pedidos) {
                        Pizza pizzaPedido = p.getPizza();
                        System.out.println("| Codigo: " + p.getCodigo() + " | Pizza: " + pizzaPedido.getNome() + " | Tamanho: " + p.getTamanho() + " | Valor: R$" + pizzaPedido.getValor() + " | Endereco: " + p.getEndereco() + " |");
                    }
                    break;
                case 3:
                    System.out.println(" ");
                    for (Pedido p : pedidos) {
                        Pizza pizzaPedido = p.getPizza();
                        System.out.println("| Codigo: " + p.getCodigo() + " | Pizza: " + pizzaPedido.getNome() + " | Tamanho: " + p.getTamanho() + " | Valor: R$" + pizzaPedido.getValor() + " | Endereco: " + p.getEndereco() + " |");
                    }
                    System.out.println(" ");
                    System.out.print("Digite codigo do pedido a ser cancelado: ");
                    int codigoCancelar = leitor.nextInt();
                    leitor.nextLine();
                    int encontrado = 0;
                    for (Pedido p : pedidos) {
                        if (codigoCancelar == p.getCodigo()) {
                            encontrado = 1;
                            pedidos.remove(p);
                            System.out.println("Pedido cancelado.");
                            break;
                        }
                    }
                    if (encontrado == 0) {
                        System.out.println("Pedido nao encontrado.");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Codigo invalido.");
                    break;
            }
        } while (opcao != 4);
    }

}
