package Desafio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaNinja<Ninja> listaNinja = new ListaNinja<>();
        int i = 0;
        boolean Sair = false;
        System.out.println("Agora você teŕa que escrever dados de 7 ninjas.");
        while (i != 7){
            i++;
            System.out.println("Escreva o nome do " + i + "º ninja.");
            String ninjaNome = scanner.nextLine();
            System.out.println("Escreva o idade do " + i + "º ninja.");
            int ninjaIdade = scanner.nextInt();
            System.out.println("Escreva a aldeia do "+i +"º ninja.");
            String ninjaAldeia = scanner.nextLine();
            scanner.nextLine();
            Ninja ninja = new Ninja(ninjaNome, ninjaIdade,ninjaAldeia);

            listaNinja.adicionarNinja(ninja);

        }
        System.out.println("Mostrar lista ninja: " + listaNinja);

        while(!Sair){
            System.out.println("O que você gostaria de fazer agora? \n1-Remover primeiro ninja \n2-Adicionar novo ninja no início \n3-Mostrar lista \n4-Sair");
            int resposta = scanner.nextInt();
            switch(resposta){
                case 1:
                    System.out.println("Ninja que será retirado: " + listaNinja.mostrarPrimeiro());
                    listaNinja.retirarPrimeiroNinja();
                    break;
                case 2:
                    System.out.println("Digite os dados do ninja que será adicionado. ");
                    System.out.println("Nome do Ninja: ");
                    String ninjaNome = scanner.nextLine();
                    System.out.println("Idade do Ninja: ");
                    int idadeNinja = scanner.nextInt();
                    System.out.println("Aldeia do Ninja: ");
                    String aldeiaNome = scanner.nextLine();

                    scanner.nextLine();

                    Ninja ninja = new Ninja(ninjaNome, idadeNinja, aldeiaNome);
                    listaNinja.adicionarPrimeiroNinja(ninja);
                    break;
                case 3:
                    System.out.println("A lista está atualmente assim: \n Mostrar lista ninja: " + listaNinja);
                    break;
                case 4:
                    Sair = true;
            }
        }

        scanner.close();
    }
}
