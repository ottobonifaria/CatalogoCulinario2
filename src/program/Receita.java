package program;
import java.util.List;

public class Receita {
    private String nome;
    private Categoria categoria;
    private double tempodePreparo;
    private Rendimento rendimento;
    private List<Ingrediente> ingredientes;
    private List<String> preparo;

    public Receita(String nomeReceita, Categoria categoria) {
        this.nome = nomeReceita;
        this.categoria = categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setTempodePreparo(double tempodePreparo) {
        this.tempodePreparo = tempodePreparo;
    }

    public void setRendimento(Rendimento rendimento) {
        this.rendimento = rendimento;
    }

    public String getNome() {

        return nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public double getTempodePreparo() {
        return tempodePreparo;
    }

    public Rendimento getRendimento() {
        return rendimento;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public List<String> getPreparo() {
        return preparo;
    }

    @Override
    public String toString() {
        return "Receita{" +
                "nomeReceita='" + nome + '\'' +
                ", categoria=" + categoria +
                ", tempodePreparo=" + tempodePreparo +
                ", rendimento=" + rendimento +
                ", ingredientes=" + ingredientes +
                ", preparo=" + preparo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Receita receita = (Receita) o;

        return nome != null ? nome.equals(receita.nome) : receita.nome == null;
    }

    @Override
    public int hashCode() {
        return nome != null ? nome.hashCode() : 0;
    }
}
