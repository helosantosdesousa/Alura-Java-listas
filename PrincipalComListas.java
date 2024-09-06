package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);

        var barbie = new Filme("Barbie", 2023);
        barbie.setDuracaoEmMinutos(200);
        meuFilme.avalia(10);

        Serie lost = new Serie("Lost", 2000);
        ArrayList<Titulo> list = new ArrayList<>();
        list.add(barbie);
        list.add(meuFilme);
        list.add(outroFilme);
        list.add(lost);

       /* System.out.println("fore diferente: ");
        list.forEach(t -> System.out.println(t));
        list.forEach(System.out::println);*/
        for (Titulo t:list) {
            if (t instanceof Filme){
                System.out.println(t.getNome());
                Filme filme = (Filme) t; //esse item (t) vem da classe filme
                System.out.println("Classificação: " + ((Filme) t).getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();

        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Margot Robbie");
        buscaPorArtista.add("Fernanda Montenegro");

        System.out.println(" ************** Antes da ordenação **************".toUpperCase());
        System.out.println(buscaPorArtista);

        System.out.println(" ************** Depois da ordenação **************".toUpperCase());
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        System.out.println(" ************** Antes da ordenação **************".toUpperCase());
        System.out.println(list);

        System.out.println(" ************** Depois da ordenação **************".toUpperCase());
        Collections.sort(list);
        System.out.println(list);

        list.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("ordenando por ano: ".toUpperCase());
        System.out.println(list);

    }
}
