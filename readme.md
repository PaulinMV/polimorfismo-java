# Polimorfismo com Herança e Interface em Java

Este repositório contém um exemplo prático de **programação orientada a objetos (POO)** em Java, ilustrando o uso de **polimorfismo por herança e interfaces**. O código implementa um sistema simples de gerenciamento de contas bancárias, focando em **reutilização de código** e **flexibilidade**.

---

## Estrutura do Código

### 1. **Classe Abstrata `ContaCorrente`**
Define uma base genérica para contas bancárias com os seguintes atributos e métodos:
- **Atributos:**
  - `tipo`: Tipo da conta (ex.: Corrente, Poupança).
  - `saldo`: Saldo disponível.
  - `agencia`: Agência bancária.
  - `titular`: Nome do titular.

- **Métodos:**
  - `sacar(valor, data)`: Realiza um saque, verificando saldo e valores inválidos.
  - `depositar(valor, data)`: Realiza um depósito, com validações semelhantes.
  - `consultarSaldo()`: Retorna o saldo atual.

---

### 2. **Interface `Pagavel`**
Define o comportamento de objetos que podem efetuar pagamentos, com o método:
- `pagar(valor, data)`: Permite realizar pagamentos.

---

### 3. **Classe `ContaPJ`**
Especializa a funcionalidade de contas bancárias para **Pessoa Jurídica (PJ)**:
- Herda de `ContaCorrente`.
- Implementa a interface `Pagavel`.
- Realiza saques e pagamentos com as mesmas validações da classe base.

---

### 4. **Classe `Polimorfismo`**
Contém o método `main` para testar o comportamento do código:
1. Cria uma conta PJ com saldo inicial de R$5000.
2. Realiza um pagamento de R$1000.
3. Realiza um saque de R$3000.

---

## Funcionalidades Demonstradas

### **Polimorfismo por Herança**
- A classe `ContaCorrente` atua como a base para outras classes especializadas, fornecendo uma implementação comum que pode ser personalizada.

### **Polimorfismo por Interface**
- A interface `Pagavel` define um contrato que classes como `ContaPJ` devem implementar, garantindo flexibilidade para criar novos comportamentos relacionados a pagamentos.

---

## Como Executar

1. Certifique-se de ter o **JDK** instalado em sua máquina.
2. Clone este repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   ```
3. Compile e execute o arquivo `Polimorfismo.java`:
   ```bash
   javac Polimorfismo.java
   java Polimorfismo
   ```

---

## Exemplos de Saída

```plaintext
Pagamento de R$1000.0 realizado em 22/11/2024
Saque de R$3000.0 realizado em 23/11/2024
```

---

## Objetivo Educacional
Este código demonstra:
- Como usar **herança** e **interfaces** para criar sistemas modulares e extensíveis.
- A importância de **validações** em métodos para garantir a integridade dos dados.
- A aplicação prática de **princípios de POO** em cenários do mundo real.

---

**Autor:** Paulo Moisés G. Vieira - RA: 159047-23