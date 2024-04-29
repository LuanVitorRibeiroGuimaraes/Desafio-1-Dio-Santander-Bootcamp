import java.lang.String;

public class Usuario {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        //capturando os dados de cada método e colocando-os dentro de uma nova variável
        contaBancaria.chamarMetodos();
        
        //mostrando os dados ao cliente após serem fornecidos pelo mesmo
        System.out.println("Ola, " + nomeCliente + ", obrigado or criar uma conta em nosso banco, sua agência e: " + numeroAgencia + ", conta: " + numeroConta + " e seu saldo de R$" + valorSaldo + " ja esta disponivel para saque.");
    }
}
