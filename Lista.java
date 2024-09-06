package br.com.alura.screenmatch.exercicios.aula04.ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista  {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = new LinkedList<>();

        list.add(1);
        list.add(5);
        list.add(3);

        list.forEach(System.out::println);

    }
}
