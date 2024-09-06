package br.com.alura.screenmatch.exercicios.aula03.ex02;

public class Dog extends Animal {
    private String raca;

    public Dog(String tipo, String raca) {
        super(tipo);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
