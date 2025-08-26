import java.util.List;

public class GerenciadorProdutos {

    public void CadastrarProduto(String nome, double preco, int quantidade, List<Produto> estoque){
        boolean nomeJaExiste = false;
        for (Produto p : estoque) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                nomeJaExiste = true;
                break;
            }
        }
        if (nomeJaExiste) {
            System.err.println("Erro o produto " + nome + "já está cadastrado no estoque!!!");
        }else {
            Produto produto2 = new Produto(nome, preco, quantidade);
            estoque.add(produto2);
            System.out.println("Produto cadastrado: " + "\n---Dados--- " + "\nNome: " + nome + "\nPreço: " + preco + "\nQuantidade: " + quantidade);

        }
    }
}
