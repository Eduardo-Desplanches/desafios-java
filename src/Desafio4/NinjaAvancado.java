package Desafio4;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    String habilidade;
    String especialidade;

    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostraInformacoes() {
        System.out.println("\n");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade(String habilidade){
        System.out.println("\n");
        System.out.println(this.nome + " usou sua habilidade especial, " + this.habilidade + "!");
    }
}
