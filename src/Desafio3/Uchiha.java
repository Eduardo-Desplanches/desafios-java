package Desafio3;

public class Uchiha extends Ninja{

    String habilidadeEspecial;
    public void mostrarHabilidadeEspecial(){
        System.out.println(habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade Especial = " + habilidadeEspecial);
    }


}
