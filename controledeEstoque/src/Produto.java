public class Produto {

    private double preco;
    private int quantidade;
    private final String nome;


    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
       this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public double setPreco(double preco) {
            if(preco > 0){
                setPreco(preco);
            }
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return"----Produtos----"
        + "\n Nome: " + getNome()
        + "\n Preço: R$" + getPreco()
        + "\n Quantidade: " + getQuantidade();
    }

}
