import java.util.ArrayList;

public class Genero {
    private String nome;
    private ArrayList<Filme> listaFilmes = new ArrayList<>();

    public Genero(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
