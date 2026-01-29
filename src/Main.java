import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
        System.out.println("Digite 1 para adicionar um usuário:");
        System.out.println("Digite 2 para listar um usuários:");
        System.out.println("Digite 3 para deletar um usuário:");
        System.out.println("Digite 4 para Sair um usuário:");

        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();

        entrada = new Scanner(System.in);
        ArrayList <String> usuarios = new ArrayList<>();
        switch (opcao) {
            case 1:
                System.out.println("Digite o nome");
                String nome = entrada.nextLine();
                usuarios.add(nome);
            case 2:
                System.out.println(usuarios);
            }
        }
    }
}