// --- // Paulo Moisés G. Vieira - 159047-23 \\ --- \\

// Este código apresenta o uso de polimorfismo por meio de herança e interfaces.
// O objetivo é criar uma estrutura reutilizável visando a programação orientada a objetos para gerenciar contas bancárias.
// O conceito de polimorfismo permite que diferentes classes ou objetos sejam tratados de forma uniforme, mesmo tendo implementações específicas para o mesmo comportamento.



// POLIMORFIMSO POR HERANÇA:
// Classe base abstrata que define os atributos e métodos genéricos de uma conta bancária.
abstract class ContaCorrente {
    private String tipo;    // Tipo da conta (e.g., Corrente, Poupança).
    private Float saldo;    // Saldo disponível na conta.
    private String agencia; // Agência bancária associada.
    private String titular; // Nome do titular da conta.

    // Construtor para inicializar os atributos da conta.
    public ContaCorrente(String tipo, Float saldo, String agencia, String titular) {
        this.tipo = tipo;
        this.saldo = saldo;
        this.agencia = agencia;
        this.titular = titular;
    }

    // Método para realizar saque.
    public void sacar(Float valor, String data) {
        if (valor <= 0) {
            System.out.println("Não é possível realizar um saque com valor negativo ou igual a zero.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado em " + data);
        }
    }

    // Método para realizar depósito.
    public void depositar(Float valor, String data) {
        if (valor <= 0) {
            System.out.println("Não é possível realizar um depósito com valor negativo ou igual a zero.");
        } else {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado em " + data);
        }
    }

    // Método para consultar o saldo disponível.
    public Float consultarSaldo() {
        return saldo;
    }
}

// POLIMORFISMO POR INTERFACE:
interface Pagavel {
    void pagar(Float valor, String data);
}

// Classe que implementa a interface 'Pagavel' e herda de 'ContaCorrente'.
// Polimorfismo por interface e herança simultaneamente.
class ContaPJ extends ContaCorrente implements Pagavel {
    public ContaPJ(String tipo, Float saldo, String agencia, String titular) {
        super(tipo, saldo, agencia, titular);
    }

    @Override
    public void pagar(Float valor, String data) {
        if (valor <= 0) {
            System.out.println("Não é possível realizar um pagamento com valor negativo ou igual a zero.");
        } else if (valor > consultarSaldo()) {
            System.out.println("Saldo insuficiente para realizar o pagamento.");
        } else {
            sacar(valor, data);
            System.out.println("Pagamento de R$" + valor + " realizado em " + data);
        }
    }
}

// Classe para testar o código.
public class Polimorfismo {
    public static void main(String[] args) {
        ContaPJ contaPJ = new ContaPJ("PJ", 5000f, "5678", "Empresa ABC");
        contaPJ.pagar(1000f, "22/11/2024");
        contaPJ.sacar(3000f, "23/11/2024");
    }
}