package CONTA_BANCARIA;
public class contaBancaria{
    private String nomePessoa;
    private long numeroConta;
    private Double saldo = 0.0;
    
    public String getNomePessoa() {
        return nomePessoa;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public long getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Double depositarValor(Double deposito){
        saldo = saldo + deposito;
        System.out.println("Depósito de R$" + deposito + " realizado com sucesso!");
        return saldo;
    }
    public Double sacarValor(Double sacar){
        if (sacar > saldo){
            System.out.println("Saldo insuficiente para realizar a operação.");
            return saldo;
        } if (sacar > 5000){
            System.out.println("Valor do saque acima do perimitido.");
            return saldo;
        } 
        else 
        saldo = saldo - sacar;
        System.out.println("Saque de" + sacar + " realizado com sucesso!");
        return saldo;
    }
    public void consultarSaldo(){
        System.out.println("Nome: " + nomePessoa);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo autal: " + saldo);
    }

}