fun main(args: Array<String>) {

    var name : String = "Brentjeffson"
    // Error occurs because the variable was not set explicitly to be nullable
//    name = null
    // This variable os nullable
    var nullableName : String? = "I am nullable!"
    println(nullableName)
//    println(nullableName.length) // causes error
//    nullableName = null

    // the code below must be performed when getting the length of a nullable variable
    // METHOD 1:  NULL CHECK
    var length = 0
    if (nullableName != null) {
        println(nullableName.length)
        length = nullableName.length
    } else {
        length = -1
    }
    println(length)

    val l = if (nullableName != null) nullableName.length else -1
    println(l)

    // METHOD 2:  SAVE CALL OPERATOR
    println(nullableName?.length)

    // METHOD 3: ELVIS OPERATOR
    var len = nullableName?.length ?: -1
    nullableName = null
    var noName = nullableName ?: "I am no one!"
    println(noName)

    // METHOD 4: !! Only use when certain that a variable has a value
//    nullableName = "Brentjeffson" // comment to raise the NullPointerException
    println(nullableName!!.length)

}