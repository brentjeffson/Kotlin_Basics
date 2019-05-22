fun main(args: Array<String>) {

    // IMMUTABLE LIST ARRAY
    val employees = listOf("Brent", "Jeffson", "Flores", "Florendo")
    println("Unsorted List -> $employees")
    println("Sorted List -> ${employees.sorted()}")

    var employeeId = 0
    for (employee in employees ) {
        println("${employeeId+1} -> $employee")
        employeeId += 1
    }
    println()
    employeeId = 0
    for (employee in employees.sorted() ) {
        println("${employeeId+1} -> $employee")
        employeeId += 1
    }

    // MUTABLE LIST ARRAY
    val admins = arrayListOf("Iris", "Morla", "Manongdo")
    println(admins)
    admins.add("Florendo")
    println(admins)
}