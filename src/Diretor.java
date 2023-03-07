import java.util.ArrayList;

public class Diretor extends Pessoa {
    private Integer quantidade_premios;
    private ArrayList<Filme> listaFilmes = new ArrayList<>();
    public Diretor(String nome) {
        super.setNome(nome);
    }

    public Integer getQuantidade_premios() {
        return quantidade_premios;
    }

    public void setQuantidade_premios(Integer quantidade_premios) {
        this.quantidade_premios = quantidade_premios;
    }

    public ArrayList<Filme> getListaFilmes() {
        return listaFilmes;
    }

    public void setListaFilmes(ArrayList<Filme> listaFilmes) {
        this.listaFilmes = listaFilmes;
    }

    public void addFilme(Filme filme) {
        this.listaFilmes.add(filme);
    }

    public void listaFilmes() {
        for (Filme filme: this.listaFilmes) {
            System.out.println(filme.getNome());
        }
    }
}
