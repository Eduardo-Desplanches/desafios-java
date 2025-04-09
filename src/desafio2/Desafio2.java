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
            System.out.println("3. Deletar Ninjas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int numero = scanner.nextInt();
            scanner.nextLine();

            switch (numero){
                case 1:
                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println("Escreva nome de ninja:");
                        ninjas[i] = scanner.nextLine();
                        System.out.println("Ninja cadastrado com sucesso");
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
                    System.out.println("Digite a posição do ninja que deseja retirar. De 1 a 5");
                    int posicao;
                    do {
                        posicao = scanner.nextInt();
                        if (posicao < 1|| posicao > ninjas.length ){
                            System.out.println("Posição inválida. Tente novamente");
                        }
                    }while(posicao < 1 || posicao > ninjas.length);
                    ninjas[posicao-1] = null;
                    System.out.println("Posição retirada com sucesso");
                    break;
                case 4:
                    System.out.println("Finalizando...");
                    condicao = false;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");

            }
        }while(condicao);

        scanner.close();
    }
}
