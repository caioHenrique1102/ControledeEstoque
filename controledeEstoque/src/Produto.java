import java.text.DecimalFormat;

public class Produto {

    private final String nome;
    private double preco;
    private int quantidade;

    DecimalFormat df = new DecimalFormat("#,##0.00");
    String numFormatado;
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        numFormatado = df.format(getPreco());
    }

    public double getPreco() {

        return preco;
    }

    public void setPreco(double preco) {
        if(preco > 0){
            this.preco = preco;
            numFormatado = df.format(getPreco());
        }else {
            System.err.println("Erro, preço do produto tem que ser positivo");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        if(quantidade >= 0){
        this.quantidade = quantidade;
        }else {
            System.err.println("Erro, quantidade do produto tem que ser maior que 0");
        }
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {

        return "----Produtos----" + "\n Nome: " + getNome() + "\n Preço: R$" + numFormatado + "\n Quantidade: " + getQuantidade() + "\n---------------------";
    }

}
