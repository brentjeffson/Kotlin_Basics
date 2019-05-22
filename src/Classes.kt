//class Car constructor(make: String, model: String){
//    val make = make
//    val model = model
//
//}

//class Car(make: String, model: String){
//    val make = make
//    val model = model
//
//}

class Car(make: String, model: String, var color: String) : Vehicle(make, model){

}

class Truck(make: String, model: String, var towingCap: Int) : Vehicle(make, model) {
    fun tow(car: Car) {
        println("Towing ${car.make} ${car.model}")
    }
}

open class Vehicle(val make: String, val model: String) {
    var isAccelerating = false

    fun accelerate() {
        if (isAccelerating) {
            println("Already accelerating")
        } else {
            println("Accelerating...")
            isAccelerating = true
        }

    }

    fun decelerate() {
        if (isAccelerating) {
            println("Decelerating...")
            isAccelerating = false
        } else {
            println("Already decelerating")
        }
    }
}

fun main(args: Array<String>) {
    val car = Car("Toyota", "Avalon", "Red")
    println(car.make)
    println(car.model)
    println(car.accelerate())
    println(car.accelerate())
    println(car.decelerate())
    println(car.decelerate())
    val truck = Truck("Ford", "F-150", 10000)
    truck.tow(car )
}