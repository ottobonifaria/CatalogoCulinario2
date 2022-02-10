package program;

import java.util.Scanner;

public class CatalogoView {

    public static void Menu(){
        Catalogo cat = new Catalogo();
        Scanner sc = new Scanner(System.in);
        int opcaoMenu = 0;

        do {

            System.out.println("Visualizar Receitas");
            System.out.println("1 - Pesquisar por Nome");
            System.out.println("2 - Cadastrar uma Receita");
            System.out.println("3 - Remover uma Receita");
            System.out.println("9 - Sair");
            opcaoMenu = sc.nextInt();

            switch (opcaoMenu){
                case 1:
                    System.out.println("Digite o nome da Receita");
                    System.out.println(cat.getReceita(sc.next()));
                    break;
                case 2:
                    System.out.println("Digite o nome da Receita");
                    String nome = sc.next();
                    System.out.println("Digite Categoria da Receita");

                    System.out.println("Doce - Salgado - Bebidas");
                    String categoria = sc.next().toUpperCase();
                    cat.add(new Receita(nome, Categoria.valueOf(categoria)));
                    break;
                case 3:
                    System.out.println("Digite o nome da Receita a ser removida");
                    cat.del(sc.next());
                    break;
            }


        }while (opcaoMenu!= 9);
    }

    public static void main(String[] args) {
        CatalogoView.Menu();
    }
}