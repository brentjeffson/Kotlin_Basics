fun main(args: Array<String>) {
    val age = 17
    if (age < 18) {
        println("Age is less than 18.")
    } else {
        println("Age is greater than 18")
    }

    when (age) {
        18 -> println("Age of user is 18")
        else -> println("Unable to determine age of user")
    }

}