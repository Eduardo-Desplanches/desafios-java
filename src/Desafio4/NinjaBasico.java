package Desafio4;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    String habilidade;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostraInformacoes(){
        System.out.println("\n");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
    }
    @Override
    public void executarHabilidade(String habilidade){
        System.out.println("\n");
        System.out.println("Eu usei minha " + this.habilidade);
    }
}
