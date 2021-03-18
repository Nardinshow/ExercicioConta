package Classes;

import Classes.TipoOperação.tipoOperacao;

public class Conta {
    
    private tipoOperacao operacao;
    private double valorOperacao;
    public double saldo;

    public tipoOperacao getOperacao() {
        return operacao;
    }


    public double getValorOperacao() {
        return valorOperacao;
    }


    public double getSaldo() {
        return saldo;
    }

    public void realizaOperacao(tipoOperacao operacao, double valor){
        this.operacao = operacao;
        this.valorOperacao = valor;

        if (operacao == tipoOperacao.SAQUE) {
            if (valor<= saldo){
                this.saldo = this.saldo - valor;
                System.out.println("Saque realizado com sucesso");
            } else
            System.out.println("Não há saldo suficiente para realizar o saque");

        }else
        if (operacao== tipoOperacao.DEPOSITO) {
            this.saldo = this.saldo + valor;
            System.out.println("Depósito realizado com sucesso!");
        }

        System.out.println("O saldo atual é: R$ " + this.saldo);
    }


    public void depositar(double valor) {
    }








}

