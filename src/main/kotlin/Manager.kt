class Manager(
    val name: String,
    val cpf: String,
    val salary: Double,
    val password: Int
) {

    fun bonus(): Double {
        return salary * 0.2
    }


    fun authenticationEmployee(password: Int): Boolean {
        if (this.password == password) {
            return true
        } else {
            return false
        }
    }

}