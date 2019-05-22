fun main(args: Array<String>) {

    val printMessage = {message : String -> println(message)}
    printMessage("I am a message printed using lambda")

    val addition = {x: Int, y: Int -> x+y}
    println(addition(1, 2))
    val additionB : (Int, Int) -> Int = {x,y -> x+y}
    println(additionB(1, 2))


    // The codes below are done asynchronously
    // Unit is equivalent of void in java
    fun downloadData(url: String, completion: () -> Unit) {
        println("Fetching data...")
        completion()
    }
    // call downloadDataFunction
    downloadData("https://www.google.com") {
        println("The code in this block, will only run after the completion()")
    }

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        println("Fetching data...")
        var car = Car("Tesla", "ModelX" ,"Red")
        completion(car)
    }
    // call downloadDataFunction
    downloadCarData("https://www.google.com") { car ->
        println("Received a ${car.color} ${car.make} ${car.model}")
    }

    // it keyword can be used instead of the variable name if there is only one argument
    downloadCarData("https://www.google.com") {
        println("Received a ${it.color} ${it.make} ${it.model}")
    }

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
        println("Fetching truck data from -> $url")
        val hasResponse = true
        if (hasResponse) {
            var truck = Truck("Ford", "F-150", 10000)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("fakeurl.com") { truck, success ->
        if (success) {
            // do something
            println("Received ${truck?.make} ${truck?.model}")
            truck?.tow(Car("Tesla", "ModelX" ,"Red"))
        } else {
            println("Request failed")
        }

    }

}