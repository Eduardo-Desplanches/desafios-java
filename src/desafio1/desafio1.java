package desafio1;

import javax.sound.midi.Soundbank;

public class desafio1 {
    public static void main(String[] args) {

        String nomeNinja1 = "Naruto";
        int idadeNinja1 = 16;
        String nomeMissão1 = "Aldeia da Areia, ajudar o quinto kazekage.";
        char dificuldaMissao1 = 'A';
        String statusMissao1;

        if(idadeNinja1 <= 15 && (dificuldaMissao1 != 'C' || dificuldaMissao1 == 'D')){
            System.out.println("================================================================================================");
            statusMissao1 = "não concluída.";
            System.out.println("Dificuldade da missão elevada para sua idade. Missão Rank: " + dificuldaMissao1 + " - " + nomeMissão1);
            System.out.println("Status da missão: " + statusMissao1 + " Feita por " + nomeNinja1);
            System.out.println("================================================================================================");
        } else{
            statusMissao1 = "concluída.";
            System.out.println("================================================================================================");
            System.out.println("Status da missão: " + statusMissao1 + " Feita por " + nomeNinja1 + " a missão de rank: " + dificuldaMissao1 + " - " + nomeMissão1);
            System.out.println("================================================================================================");
        }


        String nomeNinja2 = "Sasuke";
        int idadeNinja2 =  12;
        String nomeMissão2 = "Escolta do País da Ondas.";
        char dificuldaMissao2 = 'B';
        String statusMissao2;

        if(idadeNinja2 <= 15 && (dificuldaMissao2 != 'C' || dificuldaMissao2 != 'D')){
            statusMissao2 = "não concluída.";
            System.out.println("Dificuldade da missão elevada para sua idade. Missão Rank: " + dificuldaMissao2 + " - " + nomeMissão2);
            System.out.println("Status da missão: " + statusMissao2 + " Feita por " + nomeNinja2);
            System.out.println("================================================================================================");
        } else{
            statusMissao2 = "concluída.";
            System.out.println("Status da missão: " + statusMissao2 + " Feita por " + nomeNinja2 + " a missão de rank: " + dificuldaMissao2 + " - " + nomeMissão2);
            System.out.println("================================================================================================");
        }

        String nomeNinja3 = "konohamaru";
        int idadeNinja3 = 12;
        String nomeMissão3 = "Ajudar achar gatos.";
        char dificuldaMissao3 = 'D';
        String statusMissao3;

        if(idadeNinja3 <= 15){
            if(dificuldaMissao3 == 'C' || dificuldaMissao3 == 'D'){
                statusMissao3 = "Concluída.";
                System.out.println("Status da missão: " + statusMissao3 + " Feita por " + nomeNinja3);
                System.out.println("================================================================================================");
            }else{
                statusMissao3 = "Não concluída.";
                System.out.println("Status da missão: " + statusMissao3 + " Feita por " + nomeNinja3 + " a missão de rank: " + dificuldaMissao3 + " - " + nomeMissão3);
                System.out.println("Dificuldade da missão elevada para sua idade. Missão Rank: " + dificuldaMissao3 + " - " + nomeMissão3);
                System.out.println("================================================================================================");
            }
        } else{
            statusMissao3 = "concluída.";
            System.out.println("Status da missão: " + statusMissao3 + " Feita por " + nomeNinja3 + " a missão de rank: " + dificuldaMissao3 + " - " + nomeMissão3);
            System.out.println("================================================================================================");
        }

    }

}
