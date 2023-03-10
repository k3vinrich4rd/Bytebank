package br.com.alura.bytebank.test

import br.com.alura.bytebank.template.Client
import br.com.alura.bytebank.template.Director
import br.com.alura.bytebank.template.Manager
import br.com.alura.bytebank.template.SystemIntern

fun authenticatedForehead() {
    val manager = Manager(
        name = "Kevin Richard",
        cpf = "111.111.111-11",
        salary = 1000.00,
        password = 1000
    )

    val director = Director(
        name = "Felipe",
        cpf = "333.333.333-33",
        salary = 2000.00,
        password = 2000,
        profitShare = 100.00
    )

    val client = Client(
        name = "Grazi",
        cpf = "333.333.333-33",
        password = 1234
    )


    val systemIntern = SystemIntern()
    systemIntern.toEnter(manager, 1000)
    systemIntern.toEnter(director, 2000)
    systemIntern.toEnter(client, 1234)

}