package br.com.alura.screenmatch.exercicios.aula01;

public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString(){
        return "nome: " + this.nome + " | idade: " + this.idade;
    }
}
