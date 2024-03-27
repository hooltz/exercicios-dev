import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        List<Carro> carros = new ArrayList<>();
        int op = 0;

        do {
            System.out.println("#############################");
            System.out.println("## 1 - Registrar carro     ##");
            System.out.println("## 2 - Mostrar carros      ##");
            System.out.println("## 3 - Aumentar velocidade ##");
            System.out.println("## 4 - Diminuir velocidade ##");
            System.out.println("## 5 - Sair                ##");
            System.out.println("#############################");
            System.out.print("Digite codigo: ");
            op = leitor.nextInt();
            leitor.nextLine();
            switch (op) {
                case 1:
                    registrar(leitor, carros);
                    break;
                case 2:
                    mostrar(leitor, carros);
                    break;
                case 3:
                    aumentarVel(leitor, carros);
                    break;
                case 4:
                    diminuirVel(leitor, carros);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Codigo invalido");
            }
        } while (op != 5);
    }

    static void registrar(Scanner leitor, List<Carro> carros) {
        String marca, modelo;
        int ano;
        float velocidadeAtual;

        System.out.println("### Registrando novo carro... ###");
        System.out.print("Marca: ");
        marca = leitor.nextLine();
        System.out.print("Modelo: ");
        modelo = leitor.nextLine();
        System.out.print("Ano: ");
        ano = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Velocidade atual: ");
        velocidadeAtual = leitor.nextFloat();
        leitor.nextLine();

        Carro carro = new Carro(marca, modelo, ano, velocidadeAtual);
        carros.add(carro);
    }

    static void mostrar(Scanner leitor, List<Carro> carros) {
        int i = 1;
        for (Carro carro : carros) {
            System.out.println(i + " - " + carro.getMarca() + " " + carro.getModelo() + " " + carro.getAno() + " " + carro.getVelocidadeAtual() + "km/h");
        }
        i++;
    }

    static void aumentarVel(Scanner leitor, List<Carro> carros) {
        int i = 1;
        for (Carro carro : carros) {
            System.out.println(i + " - " + carro.getMarca() + " " + carro.getModelo() + " " + carro.getAno() + " " + carro.getVelocidadeAtual() + "km/h");
        }
        i++;
        System.out.print("Digite codigo do carro: ");
        int op = leitor.nextInt();
        leitor.nextLine();
        i = 1;
        for (Carro carro : carros) {
            if (op == i) {
                System.out.println("A velocidade atual eh " + carro.getVelocidadeAtual() + ".");
                carro.setAumentarVelocidade();
                System.out.println("A velocidade aumentou em 20, a velocidade agora eh " + carro.getVelocidadeAtual() + ".");
            }
        }
    }

    static void diminuirVel(Scanner leitor, List<Carro> carros) {
        int i = 1;
        for (Carro carro : carros) {
            System.out.println(i + " - " + carro.getMarca() + " " + carro.getModelo() + " " + carro.getAno() + " " + carro.getVelocidadeAtual() + "km/h");
        }
        i++;
        System.out.print("Digite codigo do carro: ");
        int op = leitor.nextInt();
        leitor.nextLine();
        i = 1;
        for (Carro carro : carros) {
            if (op == i) {
                if (carro.getVelocidadeAtual() == 0) {
                    System.out.println("Impossivel diminuir. Carro parado.");
                } else {
                    System.out.println("A velocidade atual eh " + carro.getVelocidadeAtual() + ".");
                    carro.setDiminuirVelocidade();
                    System.out.println("A velocidade diminuiu em 20, a velocidade agora eh " + carro.getVelocidadeAtual() + ".");
                }
            }
        }
    }
}
