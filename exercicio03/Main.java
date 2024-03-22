import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<ContaBancaria> contas = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("--------------------------");
            System.out.println("1 - Criar nova conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Sair");
            System.out.println("--------------------------");
            System.out.print("Digite opcao: ");
            opcao = leitor.nextInt();
            leitor.nextLine();
            switch (opcao) {
                case 1:
                    criarConta(leitor, contas);
                    break;
                case 2:
                    consultarSaldo(leitor, contas);
                    break;
                case 3:
                    depositar(leitor, contas);
                    break;
                case 4:
                    sacar(leitor, contas);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Codigo invalido.");
            }
        } while (opcao != 5);

    }



    static void criarConta(Scanner leitor, List<ContaBancaria> contas) {
        int num;
        String nome;
        float saldo;
        boolean contaExistente = false;

        System.out.println("---Criando nova conta...");
        System.out.print("Informe numero da conta: ");
        num = leitor.nextInt();
        leitor.nextLine();

        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == num) {
                contaExistente = true;
                break;
            }
        }
        
        if (contaExistente) {
            System.out.println("Ja existe uma conta com esse numero. Por favor, escolha outro numero");
        } else {
            System.out.print("Informe nome: ");
            nome = leitor.nextLine();
            saldo = 0;
            ContaBancaria conta = new ContaBancaria(num, nome, saldo);
            contas.add(conta);
            System.out.println("---Conta criada!");
        }
    }



    static void consultarSaldo(Scanner leitor, List<ContaBancaria> contas) {
        int num;
        System.out.println("---Consultando saldo...");
        System.out.print("Informe numero da conta: ");
        num = leitor.nextInt();
        leitor.nextLine();

        ContaBancaria contaConsultada = null;
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == num) {
                contaConsultada = conta;
                break;
            }
        }

        if (contaConsultada != null) {
            System.out.println("Conta: " + contaConsultada.getNumeroConta() + ", Nome: " + contaConsultada.getNomeTitular() + ", Saldo: " + contaConsultada.getSaldo());
        } else {
            System.out.println("Conta nao encontrada.");
        }

    }



    static void depositar(Scanner leitor, List<ContaBancaria> contas) {
        int num;
        float valor;
        System.out.println("---Depositando valor...");
        System.out.print("Informe numero da conta: ");
        num = leitor.nextInt();
        leitor.nextLine();

        ContaBancaria contaConsultada = null;
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == num) {
                contaConsultada = conta;
                break;
            }
        }

        if (contaConsultada != null) {
            System.out.print("Informe valor que deseja DEPOSITAR: ");
            valor = leitor.nextFloat();
            leitor.nextLine();
            contaConsultada.depositar(valor);
        } else {
            System.out.println("Conta nao encontrada.");
        }
    }


    
    static void sacar(Scanner leitor, List<ContaBancaria> contas) {
        int num;
        float valor;
        System.out.println("---Sacando valor...");
        System.out.print("Informe numero da conta: ");
        num = leitor.nextInt();
        leitor.nextLine();

        ContaBancaria contaConsultada = null;
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == num) {
                contaConsultada = conta;
                break;
            }
        }

        if (contaConsultada != null) {
            System.out.print("Informe valor que deseja SACAR: ");
            valor = leitor.nextFloat();
            leitor.nextLine();
            contaConsultada.sacar(valor);
        } else {
            System.out.println("Conta nao encontrada.");
        }
    }

}