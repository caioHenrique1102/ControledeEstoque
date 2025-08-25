import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        List<Produto> estoque = new ArrayList<>();
        while(loop){
            System.out.println("Olá seja bem-vindo!!");
            System.out.println("----Menu----" +
                    "\n1 para Cadastrar Produto\n" +
                    "2 para Listar Todos os Produtos\n" +
                    "3 para Registrar Entrada de Estoque\n" +
                    "4 para Registrar Saída de Estoque\n" +
                    "5 para Atualizar Preço de Produto\n" +
                    "6 para Remover Produto\n" +
                    "7 para Sair");
            int menu = scan.nextInt();
            scan.nextLine();

            switch (menu){
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nome = scan.nextLine();
                    System.out.println("Digite o preço do produto: ");
                    double preco = scan.nextDouble();
                    scan.nextLine();
                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = scan.nextInt();
                    scan.nextLine();
                    break;
                case 2:


                    break;
                case 3:


                    break;
                case 4:



                    break;
                case 5:



                    break;
                case 6:


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