package br.com.alura.screenmatch.exercicios.aula04.ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Numeros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(1);
        numeros.add(12);
        numeros.add(8);

        System.out.println("---------- LISTA ANTES DE ORDENAR ----------");
        System.out.println(numeros);
        System.out.println("---------- LISTA DEPOIS DE ORDENAR ----------");
        Collections.sort(numeros);
        System.out.println(numeros);
    }
}
