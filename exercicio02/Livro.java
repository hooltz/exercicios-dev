public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    Livro(String ti, String au, int a) {
        titulo = ti;
        autor = au;
        ano = a;
    }

    public void exibirInfo() {
        System.out.println("----------------------------");
        System.out.println(" Titulo: " + titulo);
        System.out.println(" Autor(a): " + autor);
        System.out.println(" Ano: " + ano);
        System.out.println("----------------------------");
    }
}
