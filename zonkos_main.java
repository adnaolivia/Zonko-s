import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
              
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
              
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        List<Produto> listaProdutos = new ArrayList<Produto>();
        List<Carrinho> listaCarrinhos = new ArrayList<Carrinho>();
        List<Pedido> listaPedidos = new ArrayList<Pedido>();
              
        int opcao = 0;
              
        while (opcao != 9) {
            System.out.println(".｡..｡..｡..｡..｡..｡..｡..｡..｡..｡..｡.");
            System.out.println(" ");
            System.out.println("☆*:.｡.Bem Vindo a Zonko's.｡.:*☆");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Verificar usuário");
            System.out.println("3 - Adicionar produto ao carrinho");
            System.out.println("4 - Remover produto do carrinho");
            System.out.println("5 - Fazer pedido");
            System.out.println("6 - Sair");
              
            opcao = scan.nextInt();
              
            switch (opcao) { // cadastrar usuario e verificar
                case 1:
                    System.out.println("Digite o nome do usuário:");
                    String nomeUsuario = scan.next();
                    System.out.println("Digite o email do usuário:");
                    String emailUsuario = scan.next();
                    System.out.println("Digite a senha do usuário:");
                    int senhaUsuario = scan.nextInt();
                    int idUsuario = listaUsuarios.size() + 1;
              
                    Usuario usuario = new Usuario(nomeUsuario, emailUsuario, senhaUsuario, idUsuario);
                    listaUsuarios.add(usuario);
                    break;
                case 2:
                    System.out.println("Digite o email do usuário:");
                    String email = scan.next();
                    System.out.println("Digite a senha do usuário:");
                    int senha = scan.nextInt();
              
                    boolean emailVerificado = false;
                    boolean usuarioVerificado = false;
              
                    for (Usuario user : listaUsuarios) {
                        if (user.getEmail().equals(email)) {
                            emailVerificado = true;
                            if (user.getSenha() == senha) {
                              usuarioVerificado = true;
                              break;
                            }
                          }
                        }
              
                        if (emailVerificado == true && usuarioVerificado == true) {
                          System.out.println("Usuário verificado com sucesso.");
                        }
                        else {
                          System.out.println("Usuário inválido");
                        }

                        case 3:
                            System.out.println("Digite o nome do produto:");
                            String nome = scan.next();
                            System.out.println("Digite o preço do produto:");
                            int preco = scan.nextInt();
                            System.out.println("Digite o id do produto:");
                            int id = scan.nextInt();
                            System.out.println("Digite a quantidade em estoque:");
                            int qtdEstoque = scan.nextInt();
                            listaProdutos.add(new Produto(id, nome, preco, qtdEstoque));
                            break;
                        case 4:
                            System.out.println("Digite o nome do produto que deseja remover:");
                            String nomeRemover = scan.next();
                            for (int i = 0; i < listaProdutos.size(); i++) {
                                Produto p = listaProdutos.get(i);
                                if (p.getNome().equals(nomeRemover)) {
                                    listaProdutos.remove(p);
                                    System.out.println("Produto removido com sucesso!");
                                    break;
                                }
                            }
                            break;
                        case 5:
                            System.out.println("Lista de produtos:");
                            for (int i = 0; i < listaProdutos.size(); i++) {
                              System.out.println(i + " - " + listaProdutos.get(i).getNome());
                            }
                            
                            System.out.println("Selecione o produto:");
                            int idProduto = scan.nextInt();
                            
                            System.out.println("Quantidade desejada:");
                            int qtdDesejada = scan.nextInt();
                            
                            Produto produtoSelecionado = listaProdutos.get(idProduto);
                        case 6:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                } // fim do switch
            }  // while
        } // metodo
} // classe
