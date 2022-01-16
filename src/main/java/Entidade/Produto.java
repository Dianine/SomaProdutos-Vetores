package Entidade;

public class Produto {
    /*Variavéis*/
    private String produto;
    private double price;

    /*Construtores*/
    public Produto(String produto, double pric) {
        this.produto = produto;
        this.price = pric;
    }
    /*Getter e Setter*/
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPric() {
        return price;
    }

    public void setPric(double pric) {
        this.price = pric;
    }
}