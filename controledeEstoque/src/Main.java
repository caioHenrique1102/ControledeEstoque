import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        GerenciadorEstoque gerenciadorEstoque = new GerenciadorEstoque();
        while (loop) {
            System.out.println("Olá seja bem-vindo!!");
            System.out.println("\n----Menu----" +
                    "\n1 para Cadastrar Produto\n"
                    + "2 para Listar Todos os Produtos\n"
                    + "3 para Registrar Entrada de Estoque\n"
                    + "4 para Registrar Saída de Estoque\n"
                    + "5 para Atualizar Preço de Produto\n"
                    + "6 para Remover Produto\n"
                    + "7 para Sair"
                    +"\n----------------\n");
            int menu = scan.nextInt();
            scan.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nome = scan.nextLine();
                    System.out.println("Digite a quantidade inicial do produto: ");
                    int quantidade = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o valor do Produto: ");
                    double valor = scan.nextDouble();
                    scan.nextLine();
                    Produto produto = new Produto(nome, valor, quantidade);
                    gerenciadorEstoque.CadastrarProduto(nome,produto);


                    break;
                case 2:
                    gerenciadorEstoque.ListarProdutos();

                    break;
                case 3:
                    System.out.println("Digite o nome do produto: ");
                    String nomeEntrada = scan.nextLine();
                    System.out.println("Digite a quantidade de entrada do produto: ");
                    int quantidadeProduto = scan.nextInt();
                    scan.nextLine();
                    gerenciadorEstoque.EntradaProduto(nomeEntrada, quantidadeProduto);

                    break;
                case 4:
                    System.out.println("Digite o nome do produto: ");
                    String nomeSaida = scan.nextLine();
                    System.out.println("Digite a quantidade de saida do produto: ");
                    int saida = scan.nextInt();
                    scan.nextLine();
                    gerenciadorEstoque.SaidaEstoque(nomeSaida, saida);
                    break;
                case 5:
                    System.out.println("Digite o nome do produto: ");
                    String nomeAtt = scan.nextLine();
                    System.out.println("Digite o novo valor do produto: ");
                    double novoValor = scan.nextDouble();
                    scan.nextLine();
                    gerenciadorEstoque.precoAtualizado(nomeAtt, novoValor);

                    break;
                case 6:
                    System.out.println("Digite o nome do produto: ");
                    String nomeRemover = scan.nextLine();
                    gerenciadorEstoque.removerProduto(nomeRemover);
                    break;
                case 7:
                    System.out.println("Sistema encerrando....");
                    loop = false;
                    break;

                default:
            }

        }

    }
}