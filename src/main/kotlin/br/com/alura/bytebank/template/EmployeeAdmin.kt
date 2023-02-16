package br.com.alura.bytebank.template

abstract class EmployeeAdmin(
    name: String,
    cpf: String,
    salary: Double,
    val password: Int

) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
), Authenticated {

    override fun authenticated(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}
