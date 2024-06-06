# Exercício de fixação
Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de saque da conta. Implemente a conta bancária conforme projeto abaixo:

### Exemplo 01

    Enter account data
    Number: 8021
    Holder: Bob Brown
    Initial balance: 500.00
    Withdraw limit: 300.00
    Enter amount for withdraw: 100.00
    New balance: 400.00

### Exemplo 02

    Enter account data
    Number: 8021
    Holder: Bob Brown
    Initial balance: 500.00
    Withdraw limit: 300.00
    Enter amount for withdraw: 400.00
    Withdraw error: The amount exceeds withdraw limit

### Exemplo 03

    Enter account data
    Number: 8021
    Holder: Bob Brown
    Initial balance: 500.00
    Withdraw limit: 300.00
    Enter amount for withdraw: 800.00
    Withdraw error: The amount exceeds withdraw limit

### Exemplo 04

    Enter account data
    Number: 8021
    Holder: Bob Brown
    Initial balance: 200.00
    Withdraw limit: 300.00
    Enter amount for withdraw: 250.00
    Withdraw error: Not enough balance