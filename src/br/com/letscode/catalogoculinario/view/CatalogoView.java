package br.com.letscode.catalogoculinario.view;

import br.com.letscode.catalogoculinario.controller.Catalogo;
import br.com.letscode.catalogoculinario.domain.Receita;

import java.util.Scanner;

public class CatalogoView {
    private Catalogo controller;
    private Receita ative;
    private int currentIndex;

    public CatalogoView() {
        currentIndex = 0;
        ative = null;

    }

    public void add(){
        //Captura o nome da receita.
        //Procura no catalogo a receita com mesmo nome.
        //se encontar mostra mensagem.
        //se não encontrar continua.
        //Capturar dados da nova receita.
        //cria uma nova receita
        //passa a receita para o catalogo adiconar uma receita.
        //Torna a nova receita ativa
        view();
    }
    public void find(){
        //Capturar o nome da receita.
        //Procura no catalogo a receita com mesmo nome.
       view();
    }
    public void view(){
        //Se não estiver com uma receita ativa, mostra mensagem.
        //Se estiver com uma receita ativa, continua.
        //Monta layout da tela com os dados da receita.
        //exibe o layout montado.
        //Exibe o menu de opções.

    }
    public void next(){
        //Se estiver com uma receita ativa, ativa a proxima receita.
        //Se Não estiver com uma receita ativa, ativa a primeira receita.
        if(ative!= null) {
            currentIndex++;
            ative = controller.getReceita(currentIndex);
        }

        if(ative == null){
            currentIndex=0;
            ative = controller.getReceita(currentIndex);
        }

       view();
    }
    public void previous(){
        //Se estiver com uma receita ativa, ativa a anterior receita.
        //Se Não estiver com uma receita ativa, ativa a ultima receita.
        if(ative!= null) currentIndex--;
            ative = controller.getReceita(currentIndex);
        if(ative == null){
            currentIndex = controller.getTotal() -1;
            ative = controller.getReceita(currentIndex);
        }
       view();
    }
    public void del(){
        //Se Não estiver com uma receita ativa, mostra mensagem.
        //Se estiver com uma receita ativa, confirma a operação.
        //Se confirmar, solicita ao catalogo apagar a receita.
        next();
    }
    public  void edit(){
        //Se Não estiver com uma receita ativa, mostra mensagem.
        //Se estiver com uma receita ativa, abra a tela de edição.
        view();
    }

}