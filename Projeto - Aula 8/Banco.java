public class Banco {
    Pessoa Cliente;
    int NumeroDaConta;
    String Senha;
    static float Saldo;
    public Banco(Pessoa titular, int numConta, double saldo){

    }
    public Banco(Pessoa cliente,int NumeroDaConta, String Senha, float Saldo) {

        this.Cliente = cliente;
        this.NumeroDaConta = NumeroDaConta;
        this.Senha = Senha;
        this.Saldo = Saldo;

    }

    public Pessoa getCliente(){
        return Cliente;
    }

    public int getNumeroDaConta() {
        return NumeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        NumeroDaConta = numeroDaConta;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public static float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float saldo) {
        Saldo = saldo;
    }

    public void  getDepositar(float valor) {

        this.Saldo += valor;
    }

    public void getSacar (float valor)  {

        this.Saldo -= valor;
    }
}