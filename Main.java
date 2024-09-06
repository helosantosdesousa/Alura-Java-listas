package br.com.alura.screenmatch.exercicios.aula04.ex02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Titulo> list = new ArrayList<>();

        list.add(new Titulo("Os miseráveis"));
        list.add(new Titulo("O fantasma da ópera"));
        list.add(new Titulo("O cortiço"));

        System.out.println("Antes de orndenar");
        System.out.println(list.toString());

        System.out.println("Depois de ordenar");
        list.sort(Comparator.comparing(Titulo::getNome));
        System.out.println(list.toString());
    }
}
