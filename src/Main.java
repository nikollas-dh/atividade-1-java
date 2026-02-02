import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static ArrayList <String> usuarios = new ArrayList<>();
    public static void main(String[] args) {

        boolean a = true;
        String nome;

        while (a){
        System.out.println("\nDigite 1 para adicionar um usuário:");
        System.out.println("Digite 2 para listar um usuários:");
        System.out.println("Digite 3 para editar um usuário:");
        System.out.println("Digite 4 para deletar um usuário:");
        System.out.println("Digite 5 para sair:\n");
        Scanner entrada = new Scanner(System.in);
        String opcao = entrada.nextLine();

        entrada = new Scanner(System.in);
        switch (opcao) {
            case "1":
                System.out.println("Digite o nome");
                nome = entrada.nextLine();
                usuarios.add(nome);
                System.out.println("Usuário adicionado com sucesso!");
                break;
            case "2":
                System.out.println("Lista de usuários:");
                System.out.println(usuarios);
                break;
            case "3":
                if (usuarios.size()<=0){
                    System.out.println("Não existe usuários no sistema");
                }else {
                System.out.println("Digite a posição do usuário que deseja editar:");
                int posicao = Integer.parseInt(entrada.nextLine());
                System.out.println("Digite o novo nome:");
                String novoNome = entrada.nextLine();
                usuarios.set(posicao, novoNome);
                System.out.println("Usuário atualizado com sucesso!");
                }
                break;
            case "4":
                System.out.println("Digite o nome do usuário para deletar");
                nome = entrada.nextLine();
                usuarios.remove(nome);
                System.out.println("Usuário removido com sucesso!");
                break;
            case "5":
                entrada.close();
                System.out.println("Saindo...");
                a = false;
            default:
                System.out.println("Opção inválida!");
            }
        }
    }
}
