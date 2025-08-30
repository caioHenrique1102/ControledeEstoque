import java.util.HashMap;
import java.util.Map;

public class GerenciadorEstoque {
    Map<String, Produto> estoque;

    public GerenciadorEstoque() {
        this.estoque = new HashMap<>();
    }

    public void CadastrarProduto(String nome,Produto produto) {
        if (estoque.containsKey(produto.getNome())) {
            System.out.println("Erro, já existe um produto com esse nome cadastrado.");
        } else {
            estoque.put(nome, produto);
            System.out.println("Produto " + produto.getNome() + "Cadastrado com sucesso!!");
        }
    }

    public void ListarProdutos() {
        if (estoque.isEmpty()) {
            System.err.println("Error, estoque está vazio!!!");
        }
        for (Produto p : estoque.values()) {
            System.out.println(p.toString());
        }
    }

    public void precoAtualizado(String nomeProduto, double valor) {
        Produto produtoPreco = estoque.get(nomeProduto);

        if (produtoPreco != null) {
            if (valor > 0) {
                produtoPreco.setPreco(valor);
            } else {
                System.err.println("Error valor negativo");
            }
        } else {
            System.out.println("Erro, produto não cadastrado!!!");
        }

    }

    public void removerProduto(String nomeProduto) {
        Produto removerProduto = estoque.get(nomeProduto);
        if (removerProduto != null) {
            estoque.remove(nomeProduto);
        } else {
            System.err.println("Erro, produto não cadastrado!!!");
        }
    }


    public void EntradaProduto(String nomeEntrada, int quantidade) {
        Produto produtoEntrada = estoque.get(nomeEntrada);
        if (produtoEntrada != null) {
            if(quantidade > 0){
            int att = produtoEntrada.getQuantidade() + quantidade;
            produtoEntrada.setQuantidade(att);
            }else{
                System.out.println("Não é possivel adicionar número negativo");
            }
        } else {
            System.err.println("Erro, produto não cadastrado");

        }

    }

    public void SaidaEstoque(String nomeSaida, int quantidade) {
        Produto produtoSaida = estoque.get(nomeSaida);

        if (produtoSaida != null) {
            if (produtoSaida.getQuantidade() == 0) {
                System.out.println("Estoque insuficiente");
            } else {
                int saida = produtoSaida.getQuantidade() - quantidade;
                produtoSaida.setQuantidade(saida);
            }
        } else {
            System.err.println("Erro, Produto não cadastrado");
        }
    }

}




