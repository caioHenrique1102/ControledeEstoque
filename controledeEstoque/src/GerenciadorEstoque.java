import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class GerenciadorEstoque {
    private static Map<String,Produto> estoque;

    public GerenciadorEstoque() {
        estoque = new HashMap<>();
    }

    public void CadastrarProduto(Produto produto){
        estoque.put(produto.getNome(), produto);
    }

    public int EntradaProduto(Produto produto,int quantidade){
        int atualizarQuantidade = 0;
        if(estoque.containsKey(produto.getNome())){
            atualizarQuantidade = produto.getQuantidade() + quantidade;
        }
        return atualizarQuantidade;
    }

    public int SaidaEstoque(Produto produto, int quantidade){
        int atualizarEstoque = 0;
        if(estoque.containsKey(produto.getNome())){
            atualizarEstoque = produto.getQuantidade(); - quantidade;
        }
        return  atualizarEstoque;
    }

    public void ListarProdutos(){
        if(estoque.isEmpty()){
            System.err.println("Error, estoque está vazio!!!");
        }
        for(Produto p : estoque.values()){
            System.out.println(p.toString());
        }
    }


}
