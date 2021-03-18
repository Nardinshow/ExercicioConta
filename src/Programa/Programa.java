package Programa;

import java.util.Scanner;

import Classes.Cliente;
import Classes.Conta;


public class Programa {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conta conta = new Conta(); 
        Cliente cliente = new Cliente("Bernardo", conta);
        int opcao = -1;

         while (opcao != 0){
            ExibirMenu();
            opcao = ler.nextInt();
             
            switch(opcao){
                case 0:
                System.out.println("Encerrando a operação");
                return;
                case 1:
                Sacar(ler, cliente);
                break;
                case 2:
                Depositar(ler, cliente);
                break;
                case 3:
                Saldo(cliente);
                break;
                default:
                System.out.println("Operação inválida. Verifique");

                



            }
         }
        ler.close();   
        }

    private static void Saldo(Cliente cliente) {
        cliente.saldo();
    }

    private static void Depositar(Scanner ler, Cliente cliente) {
        double valor;
        System.out.println("Digite o valor para o deposito:");
        valor= ler.nextDouble();
        cliente.depositar(valor);
    }

    private static void Sacar(Scanner ler, Cliente cliente) {
        double valor;
        System.out.println("Digite um valor para o saque:");
        valor = ler.nextDouble();
        cliente.sacar(valor);
    }

    private static void ExibirMenu() {
        System.out.println("\n******************");
        System.out.println("1 - Saque");
        System.out.println("2 - Depósito");
        System.out.println("3 - Saldo");
        System.out.println("0 - sair");
        System.out.println("\n Digite a opção que você deseja:");
    }

    
}
