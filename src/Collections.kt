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

    // IMMUTABLE MAP
    val adminSalaries = mapOf("Iris" to 50000, "Morla" to 2000, "Manongdo" to 200000)
    println("Salary of Iris is ${adminSalaries.get("Iris")}")
    println("Salary of Morla is ${adminSalaries["Morla"]}")
    println("Salary of Brentjeffson is ${adminSalaries.getOrDefault("Brentjeffson", "doesnt have a salary")}")

    for (admin in adminSalaries) {
        println(admin)
    }

    // MUTABLE MAP
    val employeeSalaries = hashMapOf("Brent" to 50000, "Jeffson" to 2000, "Florendo" to 200000)
    employeeSalaries["Flores"] = 123123
    println(employeeSalaries)

}