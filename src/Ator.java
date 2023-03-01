import java.util.ArrayList;

public class Ator extends Pessoa {
    private String registro;
    private ArrayList<Filme> listaFilmes = new ArrayList<>();

    public ArrayList<Filme> getListaFilmes() {
        return listaFilmes;
    }

    public void setListaFilmes(ArrayList<Filme> listaFilmes) {
        this.listaFilmes = listaFilmes;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
}
