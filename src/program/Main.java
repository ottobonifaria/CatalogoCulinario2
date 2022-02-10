package program;

import static program.Categoria.DOCE;
import static program.Categoria.SALGADO;

public class Main {

    public static void main(String[] args) {
        Catalogo cat = new Catalogo();
        cat.add(new Receita("Pao",SALGADO));
        cat.add(new Receita("Bolo",DOCE));
        System.out.println(cat.getReceita(1));
        System.out.println(cat.getReceita(2));
    }
}
