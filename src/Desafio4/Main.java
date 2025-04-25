package Desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaBasico Iruka = new NinjaBasico("Iruka", 30, "Shuriken Gigante");
        NinjaAvancado Madara = new NinjaAvancado("Madara", 40, "Susano", "Matar shinobi");
        Iruka.mostraInformacoes();
        Iruka.executarHabilidade(Iruka.habilidade);
        Madara.mostraInformacoes();
        Madara.executarHabilidade(Madara.habilidade);

    }
}
