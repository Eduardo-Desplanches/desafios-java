package desafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] ninjas = new String[5];
        boolean condicao = true;

        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int numero = scanner.nextInt();

            switch (numero){
                case 1:
                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println("Escreva nome de ninja:");
                        ninjas[i] = scanner.nextLine();
                    }
                    break;
                case 2:
                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] == null){
                            System.out.println("Não existe um cadastro aqui");
                        } else{
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    condicao = false;
                    break;
                default:
                    System.out.println("Escreva com as opções acima e tente novamente.");

            }
        }while(!condicao);

        scanner.close();
    }
}
