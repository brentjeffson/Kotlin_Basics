fun main(args: Array<String>) {
    // two types of string
    // # escaped string
    // # raw string

    // # ESCAPED STRING
    // string where escape characters can be used.
    val escapedString = "May the force be with you. \n\t\"Brentjeffson Florendo\""
    println(escapedString)

    // # RAW STRING
    // a raw string
    val rawString = """
       |This is a sample of raw string
       |or multiline string
    """.trimMargin()
    println(rawString)

//    for (char in rawString) {
//        println(char)
//    }

    var firstname = "brentjeffson"
    var lastname = "florendo"
    firstname = firstname.replaceRange(0, 1, firstname[0].toUpperCase().toString())
    lastname = lastname.replaceRange(0, 1, lastname[0].toUpperCase().toString())


    println(firstname.subSequence(0, 3))
    println(firstname.length)
    // STRING TEMPLATES

    var emailTemplate = "$firstname.$lastname@gmail.com".toLowerCase()
    println("Name: ${firstname.toUpperCase()} ${lastname.toUpperCase()}")
    print("Email: $emailTemplate")
}