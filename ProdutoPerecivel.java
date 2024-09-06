package br.com.alura.screenmatch.exercicios.aula02;

public class ProdutoPerecivel extends  Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int qtd, String dataValidade) {
        super(nome, preco, qtd);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

}
