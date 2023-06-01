package CONTA_BANCARIA;
import java.util.Scanner;

public class contaBancariaTeste {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        contaBancaria conta = new contaBancaria();
        System.out.println("Informe o nome do titular da conta: ");
        String nomePessoa = scanner.next();
        conta.setNomePessoa(nomePessoa);
        System.out.println("Informe o número conta: ");
        long numeroConta = scanner.nextLong();
        conta.setNumeroConta(numeroConta);
        do {
        System.out.println("Informe qual operação deseja realizar (Depositar, Sacar, Consultar): ");
        String operação = scanner.next().toUpperCase();
        switch (operação){
            case "DEPOSITAR":
            System.out.println("Informe o valor do depósito: ");
            double deposito = scanner.nextDouble();
            conta.depositarValor(deposito);
            break;
            case "SACAR":
            System.out.println("Informe o valor que deseja sacar: ");
            double sacar = scanner.nextDouble();
            conta.sacarValor(sacar);
            break;
            case "CONSULTAR":
            conta.consultarSaldo();
            break;
            default:
            System.out.println("Operação inválida!");
            break;
        }
        System.out.println("Deseja realizar outra operação?");
        String novamente = scanner.next().toUpperCase();
        if (novamente.equals("NAO")){

            break;
        } else if (novamente.equals("SIM")){
        System.out.println("");
        }else{
            System.out.println("Digito inválido! Operação finalizada.");
            break;
        }
    } while(true);
    scanner.close(); 
}

}
