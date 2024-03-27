public class Jogador {
    
    private String nome;
    private int pontuacao;
    private int nivel;

    Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setPontos(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
