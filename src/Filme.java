import java.util.ArrayList;

public class Filme {
    private String nome;
    private Integer anoLancamento;
    private Integer nota;
    private ArrayList<Ator> listaAtores = new ArrayList<>();
    private Diretor diretor;
    private Genero genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public ArrayList<Ator> getListaAtores() {
        return listaAtores;
    }

    public void setListaAtores(ArrayList<Ator> listaAtores) {
        this.listaAtores = listaAtores;
    }
}
