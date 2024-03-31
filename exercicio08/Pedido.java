public class Pedido {
    private int codigo;
    private Pizza pizza;
    private String tamanho;
    private String endereco;

    public Pedido(int codigo, Pizza pizza, String tamanho, String endereco) {
        this.codigo = codigo;
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getEndereco() {
        return endereco;
    }
}
