package Desafio5;

public class Main {
    public static void main(String[] args) {

        ContaCorrente ContaCorrenteDeNaruto = new ContaCorrente(100);

        System.out.println(ContaCorrenteDeNaruto.consultarSaldo());

        ContaCorrenteDeNaruto.depositar(2000);
        System.out.println(ContaCorrenteDeNaruto.consultarSaldo());

        ContaPoupanca ContaPoupancaDeNaruto = new ContaPoupanca(2000);

        System.out.println(ContaPoupancaDeNaruto.consultarSaldo());
        ContaPoupancaDeNaruto.depositar(2000);
        System.out.println(ContaPoupancaDeNaruto.consultarSaldo());


    }
}
