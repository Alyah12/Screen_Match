package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Resgate", 2023);
        meuFilme.avalia(8);
        var filmeDoPaulo = new Filme("Top Gun", 2023);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoPaulo;

        ArrayList<Filme> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);

        for (int i = 0; i < lista.size(); i++) {
            Titulo item = lista.get(i);
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação " + filme.getClassificacao());
            }

            ArrayList<String> buscaPorArtista = new ArrayList<String>();
            buscaPorArtista.add("Adam Sandler");
            buscaPorArtista.add("Paulo");
            buscaPorArtista.add("Jacqueline");
            System.out.println(buscaPorArtista);

            Collections.sort(buscaPorArtista);
            System.out.println("Depois da ordenação");
            System.out.println(buscaPorArtista);
            System.out.println("Lista de titulos ordenados");
            Collections.sort(lista);
            System.out.println(lista);
        }

    }
}

