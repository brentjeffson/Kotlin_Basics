fun main(args: Array<String>) {
    val adminSalaries = mapOf("Iris" to 50000, "Morla" to 2000, "Manongdo" to 200000)
    for (entry in adminSalaries) {
        print(" $entry")
    }
    println()
    for ((admin, salary) in adminSalaries) {
        println("$admin has a salary of $salary")
    }

    var index = 0
    while (index < 10) {
        println("Index: ${index+1}")
        index += 1
    }
}


