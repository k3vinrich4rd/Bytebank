package br.com.alura.bytebank.template

//Fazendo o valor dessa property não ser modificado em qualquer ponto do código
abstract class Account(
    val holder: Client, //Composição
    val numberAccount: Int  // 0 Valor padrão (tirando a necessidade de informar um valor no argumento do constructor
    // só se apenas quiser informar um valor
) : Authenticated by holder { // outra forma de fazer delegação
    open var balance = 0.0
        protected set

    //Nome do object declaration: "Count"
    companion object Count { //Não é necessário colocar o nome quando se trabalha com companion object
        //Mas continua sendo um object declaration
        //Companheiro do objeto
        var total = 0 //Deixei a property pois somente o sistema pode alterar seu valor
            //Seu acesso agora é somente para leitura escrita é impossível
            private set
    }

    init {//Executa um código antes de instanciar qualquer objeto filho de account
        //Ele tem um nome por debaixo dos panos chamado de companion
        Count.total++ //Não é necessário usar o count, pois ele é um membro
        //Exemplo: Companion.total++
    }

    fun depositInAnAccount(value: Double) {  //(Função) membro (métodos/comportamento)
        if (value > 0) {
            this.balance += value //This = Significa que estamos mexendo em um atributo do próprio objeto
        }
    }

    //(Função) membro (métodos/comportamento abstrato)
    abstract fun withdrawMoneyFomTheAccount(value: Double)

}