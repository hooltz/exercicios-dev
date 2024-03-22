import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        float resultado = 0;

        System.out.println("-----------------------");
        System.out.println("1 - Realizar operacao");
        System.out.println("2 - Encerrar");
        System.out.println("-----------------------");
        System.out.print("Digite codigo: ");

        int codigo = Integer.parseInt(leitor.nextLine());

        if (codigo == 1) {
            System.out.print("Digite numero: ");
            float num1 = Float.parseFloat(leitor.nextLine());
            System.out.print("Digite operacao (+ , - , * , /): ");
            String op = leitor.nextLine();
            System.out.print("Digite numero: ");
            float num2 = Float.parseFloat(leitor.nextLine());

            if (op.equals("+")) {
                resultado = Calculadora.somar(num1, num2);
            } else if (op.equals("-")) {
                resultado = Calculadora.subtrair(num1, num2);
            } else if (op.equals("*")) {
                resultado = Calculadora.multiplicar(num1, num2);
            } else if (op.equals("/")) {
                resultado = Calculadora.dividir(num1, num2);
            }

            System.out.print("RESULTADO: " + resultado);
        }
    }
}