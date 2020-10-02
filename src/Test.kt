fun printMessage (message:String) : Unit {
    println(message)
}
fun printMessageWithPrefix(message:String, prefix: String = "Info") {
    println("[$prefix] $message")
}
fun multiply(x:Int, y: Int) = x*y

class Contact {
    // var hi = name
    init {
        println("Hello")
    }
}

fun main(){
    printMessage("Hello")
    printMessageWithPrefix("Hello", "World")
    printMessageWithPrefix("Hi")
    println(multiply(3,4))
    var contact = Contact()
}