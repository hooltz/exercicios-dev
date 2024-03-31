import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        int op;
        
        do {
            System.out.println(" ");
            System.out.println("[1] Listar produtos");
            System.out.println("[2] Registrar produto");
            System.out.println("[3] Atualizar produto");
            System.out.println("[4] Remover produto");
            System.out.println("[5] Sair");
            System.out.println(" ");
            System.out.print("Digite opcao: ");
            op = leitor.nextInt();
            leitor.nextLine();

            switch (op) {
                case 1:
                    System.out.println(" ");
                    for (Produto produto : produtos) {
                        System.out.println("| Codigo: " + produto.getCodigo() + " | Nome: " + produto.getNome() + " | Quantidade: " + produto.getQuantidade() + " | Preco: R$" + produto.getPreco() + " |");
                    }
                    break;
                case 2:
                    String codigo;
                    int enc = 0;
                    System.out.println(" ");
                    System.out.println("---REGISTRANDO PRODUTO---");
                    System.out.println(" ");
                    System.out.print("Nome: ");
                    String nome = leitor.nextLine();
                    do {
                        System.out.print("Codigo: ");
                        codigo = leitor.nextLine();
                        for (Produto pro : produtos) {
                            if (codigo.equals(pro.getCodigo())) {
                                enc = 1;
                                System.out.println("Codigo ja existe.");
                            } else {
                                enc = 0;
                            }
                        }
                    } while (enc == 1);
                    System.out.print("Quantidade: ");
                    int quantidade = leitor.nextInt();
                    leitor.nextLine();
                    System.out.print("Preco: ");
                    float preco = leitor.nextFloat();
                    leitor.nextLine();

                    Produto produto = new Produto(nome, codigo, quantidade, preco);
                    produtos.add(produto);
                    break;
                case 3:
                    System.out.println(" ");
                    for (Produto p : produtos) {
                        System.out.println("| Codigo: " + p.getCodigo() + " | Nome: " + p.getNome() + " | Quantidade: " + p.getQuantidade() + " | Preco: R$" + p.getPreco() + " |");
                    }
                    System.out.println(" ");
                    System.out.println("---ATUALIZANDO PRODUTO---");
                    System.out.println(" ");
                    System.out.print("Informe codigo do produto que deseja atualizar: ");
                    String cod = leitor.nextLine();
                    int encontrado = 0;
                    for (Produto p : produtos) {
                        if (cod.equals(p.getCodigo())) {
                            System.out.println("Produto encontrado. O que deseja atualizar?");
                            encontrado = 1;
                            System.out.println("[1] NOME");
                            System.out.println("[2] CODIGO");
                            System.out.println("[3] QUANTIDADE");
                            System.out.println("[4] PRECO");
                            System.out.println("[5] CANCELAR");
                            System.out.print("Digite opcao: ");
                            int opcaoAtualizar = leitor.nextInt();
                            leitor.nextLine();
                            switch (opcaoAtualizar) {
                                case 1:
                                    System.out.print("Digite novo nome:");
                                    String n = leitor.nextLine();
                                    p.setNome(n);
                                    System.out.println("Nome atualizado.");
                                    break;
                                case 2:
                                    System.out.print("Digite novo codigo:");
                                    String c = leitor.nextLine();
                                    p.setCodigo(c);
                                    System.out.println("Codigo atualizado.");
                                    break;
                                case 3:
                                    System.out.print("Digite nova quantidade:");
                                    int q = leitor.nextInt();
                                    leitor.nextLine();
                                    p.setQuantidade(q);
                                    System.out.println("Quantidade atualizada.");
                                    break;
                                case 4:
                                    System.out.print("Digite novo preco:");
                                    float pr = leitor.nextFloat();
                                    leitor.nextLine();
                                    p.setPreco(pr);
                                    System.out.println("Preco atualizado.");
                                    break;
                                case 5:
                                    break;
                                default:
                                    System.out.println("Codigo invalido.");
                                    break;
                            }
                        }
                    }
                    if (encontrado == 0) {
                        System.out.println("Produto nao encontrado.");
                    }
                    break;
                case 4:
                    System.out.println(" ");
                    for (Produto p : produtos) {
                        System.out.println("| Codigo: " + p.getCodigo() + " | Nome: " + p.getNome() + " | Quantidade: " + p.getQuantidade() + " | Preco: R$" + p.getPreco() + " |");
                    }
                    System.out.println(" ");
                    System.out.println("---REMOVENDO PRODUTO---");
                    System.out.println(" ");
                    System.out.print("Informe codigo do produto que deseja remover: ");
                    String codigoRemover = leitor.nextLine();
                    int e = 0;
                    for (Produto p : produtos) {
                        if (codigoRemover.equals(p.getCodigo())) {
                            produtos.remove(p);
                            e = 1;
                            System.out.println("Produto removido.");
                            break;
                        }
                    }
                    if (e == 0) {
                        System.out.println("Produto nao encontrado.");
                    }
                    break;
            }
        } while (op != 5);

    }

}