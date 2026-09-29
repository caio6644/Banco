/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.banco;

import java.util.Scanner;

/**
 *
 * @author caio61567586
 */
public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.00;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {

        if (valor > 0 && valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    
    public void extratoBancario() {
        System.out.println("Saldo: " + this.saldo);
    }

    public void verificarSaldo() {
        if (this.saldo == 0) {
            System.out.println("Conta sem saldo");
        } else if (this.saldo > 0 && this.saldo < 500) {
            System.out.println("Saldo baixo");
        } else if (this.saldo >= 500 && this.saldo <= 2000) {
            System.out.println("Saldo normal");
        } else {
            System.out.println("Saldo elevado");
        }
    }

    public void menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("===== CONTA BANCÁRIA =====");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar ");
        System.out.println("3 - Consultar saldo");
        System.out.println("4 - Verificar situação da conta");
        System.out.println("5 - Sair");
        System.out.println("Digite uma opção:");
        int opcao = entrada.nextInt();

        switch (opcao) {

            case 1:
                System.out.print("Digite o valor do depósito: R$");
                depositar(entrada.nextDouble());
                break;

            case 2:
                System.out.print("Digite o valor do saque: R$");
                sacar(entrada.nextDouble());
                break;

            case 3:
                System.out.println("Saldo atual: R$" + this.getSaldo());
                break;

            case 4:
                verificarSaldo();
                break;

            case 5:
                System.out.println("Progama encerrado");
                break;

            default:
                System.out.println("Opção inválida");
        }
    }

    public void menuWhile() {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {

            System.out.println("===== CONTA BANCÁRIA =====");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar ");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Verificar situação da conta");
            System.out.println("5 - Sair");
            System.out.println("Digite uma opção:");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o valor do depósito: R$");
                    depositar(entrada.nextDouble());
                    break;

                case 2:
                    System.out.print("Digite o valor do saque: R$");
                    sacar(entrada.nextDouble());
                    break;

                case 3:
                    System.out.println("Saldo atual: R$" + this.getSaldo());
                    break;

                case 4:
                    verificarSaldo();
                    break;

                case 5:
                    System.out.println("Progama encerrado");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public void munoDoWhile() {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===== CONTA BANCÁRIA =====");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar ");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Verificar situação da conta");
            System.out.println("5 - Sair");
            System.out.println("Digite uma opção:");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o valor do depósito: R$");
                    depositar(entrada.nextDouble());
                    break;

                case 2:
                    System.out.print("Digite o valor do saque: R$");
                    sacar(entrada.nextDouble());
                    break;

                case 3:
                    System.out.println("Saldo atual: R$" + this.getSaldo());
                    break;

                case 4:
                    verificarSaldo();
                    break;

                case 5:
                    System.out.println("Progama encerrado");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 5);
    }
     public void exibirExtradoSimples(){
         for (int i = 1;i <= 5; i++){
             System.out.println("Operação" + i);
         }
     }
     public void exibirOperacoes(int quantidade){
         for (int i = 1;i <= quantidade; i++){
             System.out.println("Operação" + i);
         }
     }
}
