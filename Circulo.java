package br.com.alura.screenmatch.exercicios.aula03.ex05;

public class Circulo implements Forma{
    private double raio;
    private double PI=3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return PI*raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
