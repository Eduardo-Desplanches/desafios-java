package Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        double taxa = 0.01;
        double valorTaxado = valor *(1-taxa);
        saldo += valorTaxado;
    }
}
