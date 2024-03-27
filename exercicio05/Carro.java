public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidadeAtual;

    Carro(String marca, String modelo, int ano, float velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setAumentarVelocidade() {
        this.velocidadeAtual += 20;
    }

    public void setDiminuirVelocidade() {
        this.velocidadeAtual -= 20;
        if (this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0;
        }
    }
}
