package br.com.alura.bytebank.template

class AccountSavings(
    holder: Client,
    numberAccount: Int
) : Account(
    holder = holder,
    numberAccount = numberAccount
), AccountTransfer { //Implementação da ‘interface’

    //Método abstrato
    override fun withdrawMoneyFomTheAccount(value: Double) {
        if (this.balance >= value) {
            this.balance -= value
        }
    }

    //'Interface'
    //Tira de uma conta origem(que chama o método) e manda para uma conta destino
    //A conta de origem da transferência, é o objeto que chamar o método
    override fun accountTransfer(value: Double, destiny: Account): Boolean {  //early return
        if (value >= balance) { //Faz a validação
            balance -= value //Pega o saldo
            destiny.depositInAnAccount(value) //Incrementa(Conta de origem, mexe no saldo na conta destino)
            return true
        }
        return false
    }

}