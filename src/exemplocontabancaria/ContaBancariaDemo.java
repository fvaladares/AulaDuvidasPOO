package exemplocontabancaria;

import java.util.Scanner;

public class ContaBancariaDemo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nomeCliente;
        int numeroConta;
        double saldo;
        ContaBancaria contaBancaria; // Declaração da variável do tipo ContaaBancaria

        System.out.println("Sistema bancário UNA.");
        System.out.println("Cadastro de conta.");
        System.out.println("Informe o nome do cliente: ");
        nomeCliente = entrada.next();
        System.out.println("Informe o número da conta: ");
        numeroConta = entrada.nextInt();
        System.out.println("Informe o saldo: ");
        saldo = entrada.nextDouble();

        contaBancaria = new ContaBancaria(numeroConta,
                nomeCliente,
                saldo);

        System.out.println("Informe o valor que deseja depositar: ");
        saldo = entrada.nextDouble();

        if (contaBancaria.deposito(saldo)) {
            System.out.printf("Novo saldo R$ %1$.2f \n", contaBancaria.saldo());
        } else {
            System.out.println("O valor informado no depósito não é válido.");
        }
    }
}
