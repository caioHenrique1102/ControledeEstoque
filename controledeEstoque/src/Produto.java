public class Produto {

    private final String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double getPreco() {

        return preco;
    }

    public void setPreco(double preco) {

        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {

        return "----Produtos----" + "\n Nome: " + getNome() + "\n Preço: R$" + getPreco() + "\n Quantidade: " + getQuantidade() + "\n---------------------";
    }

}
