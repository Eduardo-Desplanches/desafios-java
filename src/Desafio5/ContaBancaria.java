package Desafio5;

public abstract class ContaBancaria implements Conta{

    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    public abstract void depositar(double valor);

    @Override
    public String toString() {
        return super.toString();
    }
}
