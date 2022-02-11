package br.com.letscode.catalogoculinario.domain;

import br.com.letscode.catalogoculinario.enums.TipoMedida;

public class Ingrediente {
    private String nomeIngrediente;
    private double quantidade;
    private TipoMedida tipo;

    public Ingrediente(String nomeIngrediente, double quantidadeIngrediente, TipoMedida tipo) {
        this.nomeIngrediente = nomeIngrediente;
        this.quantidade = quantidadeIngrediente;
        this.tipo = tipo;
    }

    public String getNomeIngrediente() {
        return nomeIngrediente;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public TipoMedida getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nomeIngrediente='" + nomeIngrediente + '\'' +
                ", quantidadeIngrediente=" + quantidade +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ingrediente that = (Ingrediente) o;

        return nomeIngrediente.equals(that.nomeIngrediente);
    }

    @Override
    public int hashCode() {
        return nomeIngrediente.hashCode();
    }
}

