package br.com.alura.screenmatch.exercicios.aula03.ex05;

public class Quadrado implements Forma {
    private double largura;

    public Quadrado(double largura) {
        this.largura = largura;
    }

    @Override
    public double calculaArea() {
        return (largura*largura);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
