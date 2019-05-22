fun main(args: Array<String>) {
    var cash = 0

    fun addAmount(amount: Int = 0):Int {
        cash += amount
        return cash
    }

    println(addAmount(500))
    println(addAmount())
}