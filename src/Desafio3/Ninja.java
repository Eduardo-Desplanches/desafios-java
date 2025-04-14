package Desafio3;

public class Ninja {
    String nome;
    int idade;
    String missao;
    char nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes(){
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("missão = " + missao);
        System.out.println("Nível de Dificuldade = " + nivelDificuldade);
        System.out.println("Status de Missão = " + statusMissao);
    }
}
