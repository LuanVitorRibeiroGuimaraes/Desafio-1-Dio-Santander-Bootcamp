import java.util.Scanner;
import java.lang.String;

public class ContaBancaria {
    Scanner sc = new Scanner(System.in);

    //metodo solicitando o nome do cliente
    public String nomeCliente(){
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        return nome;
    }
    
    //metodo solicitando o número da conta
    public int numeroConta(){
        System.out.print("Digite o numero da sua conta: ");
        int conta = sc.nextInt();
        sc.nextLine();
        return conta;
    }

    //metodo solicitando o numero da agencia
    public String numeroAgencia(){   
        System.out.print("Digite a sua agencia: ");
        String agencia = sc.nextLine();
        return agencia;
    } 

    //metodo mostrando saldo
    public double saldo(){
        double saldo = 930.54;
        System.out.print("Saldo total: " + saldo);
        return saldo;
    }

    public void chamarMetodos(){
        nomeCliente();
        numeroConta();
        numeroAgencia();
        saldo();
    }
}